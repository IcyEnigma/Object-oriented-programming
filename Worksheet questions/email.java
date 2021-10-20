import java.util.Scanner;
class MyException extends Exception
{
    public MyException(String s)
    {
        // Call constructor of parent Exception
        super(s);
    }
}

public class email {
    //write a program that gets an email id and checks if it is valid. If not returns one of the following exceptions, DotException, AtTheRateException, DomainException//
    void verifyEmail(String email) throws MyException{
        int dotCount = email.length() - email.replace(".", "").length();
        int atCount = email.length() - email.replace("@", "").length();
        if(dotCount != 1){
            throw new MyException("DotException: Invalid dot usage");
        }
        if(atCount != 1){
            throw new MyException("AtTheRateException: Invalid @ usage");
        }
        String domain = email.substring(email.indexOf(".") + 1);
        if(domain != "com"){
            throw new MyException("DomainException: Invalid Domain");
        }
        System.out.println("Valid email address");
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        email obj = new email();
        String email = sc.next();
        try{
            obj.verifyEmail(email);
        }
        catch(MyException e){
            System.out.println(e.getMessage());
        }
    }
}
