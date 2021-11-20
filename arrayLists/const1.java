import java.util.*;
class book{
    int id, quantity;
    String name, author, publisher;
    public book(int id, String name, String author, String publisher, int quantity){
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
    }
}
public class const1 {
    public static void main(String[] args){
        List<book> list = new ArrayList<book>();

        book b1 = new book(1, "java", "bob", "pub1", 10);
        book b2 = new book(2, "c++", "john", "pub2", 20);
        book b3 = new book(3, "python", "jane", "pub3", 30);


        list.add(b1);
        list.add(b2);
        list.add(b3);

        for(book b : list){
            System.out.println(b.id + " " + b.name + " " + b.author + " " + b.publisher + " " + b.quantity);
        }
    }
}
