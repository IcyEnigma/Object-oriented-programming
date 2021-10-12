class UserDefinedException extends Exception{
    public UserDefinedException(String str){
        super(str);
    }
}

public class userDefined{
    public static void main(String args[]){
        try{
        throw new UserDefinedException("Custom error message");
        }
        catch(UserDefinedException ude){
            System.out.println("Caught the exception");
            System.out.println(ude.getMessage());
        }
    }
}