import java.util.*;

public class maxFrequency {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.nextLine();
        sc.close();
        int max = 0;
        char ch = ' ';
        for(int i = 0; i < str.length(); i++){
            int count = 0;
            for(int j = 0; j < str.length(); j++){
                if(str.charAt(i) == str.charAt(j)){
                    count++;
                }
            }
            if(count > max){
                max = count;
                ch = str.charAt(i);
            }
        }
        System.out.println("The character '" + ch + "' appears most often in the string '" + str + "' and it appears " + max + " times");
    }
}
