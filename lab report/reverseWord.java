import java.util.*;
public class reverseWord{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        sc.close();
        System.out.println("\n The reversed words are: ");
        String[] words = str.split("\t");
        String reverse = "";
        for(int i = 0; i < words.length; i++){
            String word = words[i];
            String reverseWord = "";
            for(int j = word.length() - 1; j >= 0; j--){
                reverseWord += word.charAt(j);
            }
            reverse += reverseWord + "\n";
        }
        System.out.println(reverse);
    }
}