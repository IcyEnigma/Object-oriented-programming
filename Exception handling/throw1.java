public class throw1 {
    public static void validate(int age) {
        if (age < 18) {
            throw new ArithmeticException(age + " : Not eligible to vote");
        } else {
            System.out.println(age + " : Eligible");
        }
    }

    public static void main(String args[]) {
        validate(19);
        validate(13);
        System.out.println("Rest of the code");
    }
}
