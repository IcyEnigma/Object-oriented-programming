import java.util.*;

public class reversingWords {
    /*Reverse the words in a string*/
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.nextLine();
        String[] words = str.split(" ");
        String reversed = "";
        for(int i = words.length-1; i >= 0; i--){
            reversed += words[i] + " ";
        }
        System.out.println(reversed);
    }
}
    
