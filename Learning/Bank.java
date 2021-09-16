class Account {
    private double bal; 
    private int accNum; 

    public Account(int a){ 
        bal = 0.0;
        accNum = a; 
    } 
    public void deposit (double sum){ 
        if (sum>0)
            bal+=sum;
        else 
            System.err.println("Account.deposit(...): "
                    +"cannot deposit negative amount.");
    }
    public void withdraw (double sum){
        if (sum>0)
            bal-=sum; 
        else 
            System.err.println("Account.withdraw(...): "
                    +"cannot withdraw negative amount.");
    }
    public double getBalance() { 
        return bal; 
    }
    public double getAccountNumber(){
        return accNum;
    }
    public String toString(){
      return "Acc " + accNum + ": " + "balance = "+ bal;   
    }
    public final void print(){
           System.out.println(toString()); 
    }

}

class SavingsAccount extends Account { 
    private double interest;
    
    public SavingsAccount(int accNum, double interest) {
        super(accNum);
        this.interest=interest;
    }
    public double addInterest (double interest) { 
        double x = super.getBalance() * interest; 
        super.deposit(x);
        return x;
    }
    public String toString() {
        return super.toString()+" Interest : " + interest; 
    }
}

class CurrentAccount extends Account {
    private double limit; 

    public CurrentAccount(int acctNum, double limit) {
        super(acctNum);
        this.limit=limit;
    }
    public double getLimit() {
        return this.limit;
    }
    public void withdraw (double limit) { 
        if (limit <= this.limit)
            super.withdraw(limit);
        else { 
            System.out.println("  limit exceeded" );
        }
    }
    public String toString() { 
        return super.toString() +" Limit : "+limit; 
    }
}

public class Bank {

    public static void main(String[] args) {
        SavingsAccount a = new SavingsAccount(25767286,0.22);
        CurrentAccount b = new CurrentAccount(24762925, 75);
        a.deposit(100);
        a.addInterest(0.35);
        System.out.println(a.toString());
        System.out.println(b.getLimit());
        Account[] cc = new Account[2];
        cc[0] = new SavingsAccount(36712581,0.5);
        cc[1] = new CurrentAccount(43675730, 100);
        for(int i=0; i<cc.length;i++) {
            if (cc[i] instanceof SavingsAccount) {
                SavingsAccount acc = (SavingsAccount) cc[i];
                cc[0].deposit(150);
                System.out.println(((SavingsAccount) cc[0]).addInterest(0.1));
                System.out.println(acc.toString());
            }else{
                CurrentAccount acc1 = (CurrentAccount) cc[1];
                acc1.deposit(1000);
                System.out.println(cc[1].toString());
                acc1.withdraw(500);
            }
        }
    }
}