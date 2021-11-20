import java.util.*;

public class arraylist1 {
    public static void main(String[] args) {
        List<String> al = new ArrayList<String>();
        System.out.println("Initital list of elements: " + al);
        al.add("Ravi");
        al.add("Vijay");
        al.add("Ajay");
        System.out.println("After uisng add() method: " + al);

        al.add(1, "Gaurav");
        System.out.println("After invoking add() method with index param: " + al);
        List<String> al2 = new ArrayList<String>();
        al2.add("Sonoo");
        al2.add("Hanumat");

        al.addAll(al2);
        System.out.println("After adding another list: " + al);
        List<String> al3 = new ArrayList<String>();
        al3.add("John");
        al3.add("Rahul");
        al.addAll(1, al3);
        System.out.println("After adding another list at index: " + al);
    }
}
