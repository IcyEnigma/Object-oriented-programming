import java.util.*;

interface items{
    public int getItem(String item);
    public void addItem(String item, int amount);
    public void getAll();
}

interface money{
    public void addCard(String cardNo, String CVV);
    public void pay(int amount);
    public void refund(int amount);
}

public class Shop implements items{
    static HashMap<String, Integer> items = new HashMap<String, Integer>();

    class Customer implements money{
        String name;
        String cardNo;
        String CVV;
        Customer(String name){
            this.name = name;
            System.out.println("Welcome "+name);
        }
        public void addCard(String cardNo, String CVV){
            this.cardNo = cardNo;
            this.CVV = CVV;
        }
        public void pay(int amount){
            System.out.printf("Paying %d from Card %s as %s\n", amount, cardNo, name);
        }
        public void refund(int amount){
            System.out.println("Refunding "+amount+" to Card "+cardNo);
        }
    }

   public void addItem(String item, int amount) {
        items.put(item, amount);
    }

    public int getItem(String item) {
        return items.get(item);
    }

    public void getAll(){
        System.out.println(items);
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Shop shop = new Shop();
        System.out.println("Welcome to shopping portal");
        System.out.printf("Enter name: ");
        String name = in.next();
        Shop.Customer c = shop.new Customer(name);
        System.out.printf("Enter card number: ");
        String cardNo = in.next();
        System.out.printf("Enter CVV: ");
        String CVV = in.next();
        c.addCard(cardNo, CVV);

        shop.addItem("Bread", 50);
        shop.addItem("Butter", 100);
        shop.addItem("Milk", 25);
        shop.addItem("Cheese", 70);

        System.out.println("Available items:");
        shop.getAll();

        System.out.printf("Enter item to buy: ");
        String item = in.next();
        int total;
        if(items.containsKey(item)){
            System.out.printf("\nEnter quantity: ");
            int amount = in.nextInt();
            System.out.println("Total is : "+ (items.get(item) * amount));
            c.pay(amount * items.get(item));
            total = amount * items.get(item);
        }
        else{
            System.out.println("Item not available");
            return;
        }

        System.out.printf("Item purchased! Input 'ret' to return the item and avavil a refund ");
        String ret = in.next();
        if(ret.equals("ret")){
            c.refund(total);
        }
    }
}