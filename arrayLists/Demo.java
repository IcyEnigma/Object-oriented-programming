import java.util.*;

class Demo {
    public static void main(String[] args)
    {
        Set<Integer> h1 = new LinkedHashSet<Integer>();
        Stack<Integer> s1 = new Stack<Integer>();
        for (int i = 0; i < 6; i++)
            h1.add(i);
        for (int h : h1) {
            s1.push(h);
        }
        while (!s1.isEmpty()) {
            System.out.print(s1.pop() + " ");
        }
    }
}
