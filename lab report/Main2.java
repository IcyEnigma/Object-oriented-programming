import java.util.Scanner;

class MyException extends Exception {
    public MyException(String s) {
        super(s);
    }
}

public class Main2 {
    public static void main(String args[]) {
        try {
            Scanner sc = new Scanner(System.in);
            String g = sc.nextLine();
            String r = sc.nextLine();
            StringBuffer e = new StringBuffer(g);
            if (e.indexOf(r) < 0) {
                throw new MyException("Accessing Non-Specified Index ");
            } else {
                System.out.println(e.indexOf(r));
            }
        } catch (MyException ex) {
            System.out.println("Caught");
            System.out.println(ex.getMessage());
        }
    }
}