public class test {
    private String function(String temp, int data){
        return("HAI");
    }
    private String function(int data, String temp){
        return("hello");
    }
    public static void main(String[] args){
        test obj = new test();
        System.out.println(obj.function(4,"i"));
    }
}
