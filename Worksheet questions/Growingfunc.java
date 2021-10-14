import java.io.*;
import java.util.*;
interface Growing
{
    public void isGrowing();
}
class GrowingNumber implements Growing
{
    Scanner kb = new Scanner(System.in);
    int n = kb.nextInt();
    public void isGrowing()
    {
        boolean flag = false;
        int rem = n%10;
        n=n/10;
        while(n>0)
        {
            if(rem <= n%10)
            {
                flag = true;
                break;
            }
            rem = n%10;
            n=n/10;
        }
        if(!flag)
        System.out.println("Growing number");
        else
        System.out.println("Not growing number");
        
    }
}
class GrowingString implements Growing
{
    Scanner kb = new Scanner(System.in);
    String str = kb.next();
    public void isGrowing()
    {
        boolean flag = false;
        int l = str.length();
        char ch[] = new char[l];
        for(int i=0;i<l;i++)
        {
            ch[i] = str.charAt(i);;
        }
        Arrays.sort(ch);
        for(int i=0;i<l;i++)
        {
            if(ch[i] != str.charAt(i))
            flag = true;
        }
        flag = false;
        if(!flag)
        System.out.println("Growing String");
        else
        System.out.println("Not growing string");
    }
}
public class Growingfunc
{
    public static void main(String args[])
    {
        Growing ob1 = new GrowingNumber();
        Growing ob2 = new GrowingString();
        ob1.isGrowing();
        ob2.isGrowing();
    }
}

