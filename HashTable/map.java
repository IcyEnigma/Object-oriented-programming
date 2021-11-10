import java.util.*;
public class map {
    public static void main(String args[])
    {
        HashMap<Integer, String> hm = new HashMap<Integer, String>();
        hm.put(1, "One");
        hm.put(2, "Two");
        hm.put(3, "Three");
        System.out.println("Value for 1 is " + hm.get(1));
        for (Map.Entry<Integer, String> e : hm.entrySet())
            System.out.println(e.getKey() + " " + e.getValue());
    }
}