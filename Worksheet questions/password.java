import java.util.Scanner;
public class password {
    void verifyPassword(String str) throws Exception{
        int upper = 0, lower = 0, number = 0, special = 0;
 
        for(int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z')
                upper++;
            else if (ch >= 'a' && ch <= 'z')
                lower++;
            else if (ch >= '0' && ch <= '9')
                number++;
            else
                special++;
        }
        if(special == 0){
            throw new Exception("Should contain at least one special character");
        }
        if(number == 0){
            throw new Exception("Should contain at least one digit");
        }
        
        if(!(str.length() >= 10 && str.length()<=20)){
            throw new Exception("Should be minimum of 10 characters and maximum of 20 characters");
        }
        
        System.out.println("Valid Password");
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        sc.nextLine();
        sc.nextLine();
        String pass = sc.nextLine();
        try{
            password obj = new password();
            obj.verifyPassword(pass);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
