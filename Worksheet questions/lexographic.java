import java.util.Scanner;

public class lexographic
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String s1 = scan.nextLine();
        String s2 = scan.nextLine();
        scan.close();
        System.out.println(s1.compareTo(s2));
    }
}