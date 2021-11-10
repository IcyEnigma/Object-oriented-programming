import java.util.Scanner;
class wrongIndexException extends Exception {
    public wrongIndexException(String s) {
        super(s);
    }
}

public class userException {
    public static void main(String[] args) throws wrongIndexException {
        try{
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String search = sc.nextLine();
        sc.close();
        StringBuffer sb = new StringBuffer(s);
        if(sb.indexOf(search) == -1) {
            throw new wrongIndexException("Wrong index accessed");
        }
        else{
            System.out.println(sb.indexOf(search));
        }

        }
        catch(wrongIndexException e) {
            System.out.println("Error caught");
            System.out.println(e.getMessage());
        }
    }
}
