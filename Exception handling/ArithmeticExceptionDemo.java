public class ArithmeticExceptionDemo {
    public static void main(String[] args) {
        int a = 10, b = 0;
        try {
            int c = a / b;
            System.out.println("c = " + c);
        } catch (ArithmeticException e) {
            System.out.println("Exception occurred: " + e);
        }
        System.out.println("Program continues...");
    }
}
