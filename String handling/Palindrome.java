import java.util.Scanner;

public class Palindrome {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        sc.close();
        int len = str.length();
        int i = 0;
        int j = len - 1;
        while(i < j){
            if(str.charAt(i) != str.charAt(j)){
                System.out.println("Not a palindrome");
                break;
            }
            i++;
            j--;
        }
        if(i >= j){
            System.out.println("Palindrome");
        }
    }
}
