import java.util.*;
public class removeSpace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string:");
        String str = sc.nextLine();
        sc.close();
        String res = "";
        for(int i=0; i<str.length(); i++) {
            if(str.charAt(i) != ' ') {
                res += str.charAt(i);
            }
        }
        System.out.println(res);
    }
}
