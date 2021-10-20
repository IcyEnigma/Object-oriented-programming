import java.util.Scanner;
public class Differ {
    public static void main(String args[])
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter an integer");
        int a = scn.nextInt();
        System.out.println("Enter a String");
        String b = scn.nextLine();
        System.out.printf("You have entered:-" + a + " " +"And name as " + b);

    }
    
}
