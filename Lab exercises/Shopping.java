import java.util.*;  
interface Inventory {
    int getAvail(String x);
    void setAvail(String x, int y);
    void printInv();
}

interface Payment {
    void getCard(String a, String b, String c);
    void getOTP(String otp);
}

public class Shopping implements Inventory, Payment {

    HashMap<String, Integer> inv=new HashMap<String, Integer>();

    class Customer {
        String name;
        boolean reg;
        int nOOfVisits;
        Customer(String name, boolean reg, int nOOfVisits) {
            this.name = name;
            this.reg = reg;
            this.nOOfVisits = nOOfVisits;
        }
        
        boolean getReg() {
            return reg;
        }

        void setReg(boolean r) {
            reg = r;
        }

        void IncVisit() {
            nOOfVisits++;
        }

        void print() {
            System.out.println("Name: "+name+" \nRegistered: "+reg+" \nNumber of Visits: "+nOOfVisits);
        }
    }

    String card,exp,CVV;
    public void getCard(String card, String exp, String CVV) {
        this.card = card;
        this.exp = exp;
        this.CVV = CVV;
    }

    public void getOTP(String OTP) {
        if(OTP.length() == 4) System.out.println("Payment Received");
        else System.out.println("Payment failed");
    }

    public void setAvail(String x , int y) {
        inv.put(x,y);
    }

    public int getAvail(String x) {
        if(!inv.containsKey(x)) {
            System.out.println("No such product");
            return 0;
        }
        return inv.get(x);
    }
    public void printInv() {
        System.out.println(inv);
    }
    
    public static void main(String args[]) {
        Shopping ob = new Shopping();
        ob.setAvail("Milk", 10);
        ob.setAvail("Pen", 15);
        ob.setAvail("Meat", 5);
        System.out.println("Welcome\nEnter Details");
        Scanner sc = new Scanner(System.in);
        Shopping.Customer person = ob.new Customer(sc.next(), sc.nextBoolean(), sc.nextInt());
        person.print();
        System.out.println("\nItems Available");
        ob.printInv();
        System.out.println("\nEnter product");
        int amount = ob.getAvail(sc.next());
        if(amount != 0) {
            System.out.println("Enter amount");
            if(sc.nextInt() <= amount) {
                ob.getCard("1238971230", "12/27", "456");
                ob.getOTP("1011");
            }
        }
        person.setReg(true);
        person.IncVisit();
        sc.close();
    }
}