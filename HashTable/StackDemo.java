import java.util.*;

public class StackDemo 
{
    public static void main(String args[])
    {
        Stack<String> stack = new Stack<String>();
        stack.push("One");
        stack.push("Two");
        stack.push("Three");
        stack.push("Four");

        Iterator<String> itr = stack.iterator();
        while (itr.hasNext()) 
        {
            System.out.print(itr.next() + " ");
        }

        System.out.println();

        stack.pop();

        itr = stack.iterator();

        while (itr.hasNext()) 
        {
            System.out.print(itr.next() + " ");
        }
    }
}