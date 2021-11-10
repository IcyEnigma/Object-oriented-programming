public class equating {
    public static void main(String args[]) {
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = new String("Hello");
        String s4 = new String("Hello");
        System.out.println(s3 == s4);
        System.out.println(s1.equals(s4));
    }
}
