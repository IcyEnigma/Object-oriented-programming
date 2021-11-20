import java.util.*;

class Customer{
    String name;
    int orderNo;
    Customer(String name, int orderNo){
        this.name = name;
        this.orderNo = orderNo;
    }
}
public class queue {
    //Create a queue of Customer objects
    public static void main(String[] args) {
        Queue<Customer> q = new LinkedList<Customer>();
        Scanner sc = new Scanner(System.in);
        q.add(new Customer("A", 1));
        q.add(new Customer("B", 2));
        q.add(new Customer("C", 3));
        q.add(new Customer("D", 4));
        q.add(new Customer("E", 5));
        q.add(new Customer("F", 6));
        q.add(new Customer("G", 7));

        System.out.println("The customers waiting in queue are: ");
        for(Customer c : q){
            System.out.println(c.name + " " + c.orderNo);
        }
        while(!q.isEmpty()){
            System.out.println("Enter 'y' to serve a customer");
            String ans = sc.next();
            if(ans.equals("y")){
                Customer c = q.remove();
                System.out.println("Customer: " + c.name + " OrderNo: " + c.orderNo + " - served");
            }
        }
        sc.close();
    }
}
