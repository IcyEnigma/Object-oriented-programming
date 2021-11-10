import java.util.*;

public class arrayList4 {
    public static void main(String args[]) {
        ArrayList<String> list = new ArrayList<String>();

        list.add("Ravi");
        list.add("Vijay");
        list.add("Ravi");
        list.add("Ajay");

        System.out.println("Traversing list through Iterator:");
        Iterator itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        System.out.println("\n");

        System.out.println("Traversing list through for - each loop:");
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("\n");

        System.out.println("Traversing list through List Iterator:");
        ListIterator<String> list1 = list.listIterator(list.size());
        while (list1.hasPrevious()) {
            String str = list1.previous();
            System.out.println(str);
        }
        System.out.println("\n");

        System.out.println("Traversing list through for loop:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("\n");

    }

}