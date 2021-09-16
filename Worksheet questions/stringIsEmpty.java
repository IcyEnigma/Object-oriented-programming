import java.util.Scanner;
public class stringIsEmpty{
    static String isEmpty(String s){
        String res = (s.length() == 0) ? "The string is empty": "The string is " + s;
        return res;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        System.out.println(isEmpty(str));
    }
}