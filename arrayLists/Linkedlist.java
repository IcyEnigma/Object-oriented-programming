import java.util.*;
public class Linkedlist {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);
        arr.remove(new Integer(0));
        arr.remove(1);
        System.out.println(arr);
    }
}
