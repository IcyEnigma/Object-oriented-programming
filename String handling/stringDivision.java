import java.util.*;

public class stringDivision{
    public static void main(String args[]){
        /*divide a string into n equal parts*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.nextLine();
    
        System.out.println("Enter the number of parts");
        int n = sc.nextInt();
        sc.close();
        int len = str.length();
        int part_len = len/n;
        int rem = len%n;
        int i;
        for(i=0;i<n;i++){
            if(i<rem){
                System.out.println(str.substring(i*part_len,(i+1)*part_len+1));
            }
            else{
                System.out.println(str.substring(i*part_len,(i+1)*part_len));
            }
        }
    }
}