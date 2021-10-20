import java.util.Scanner;
public class palindrome {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        int length = str.length();
        int i = 0;
        int j = length - 1;
        while(i < j){
            if(str.charAt(i) != str.charAt(j)){
                System.out.println(str + " :not a palindrome");
                break;
            }
            i++;
            j--;
        }
        if(i >= j){
            System.out.println(str + " :palindrome");
        }
    }
    
}
