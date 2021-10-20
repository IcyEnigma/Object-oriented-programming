public class test1 {
    String str = "a";

    void A(){
        try{
            str += "b";
            B();
        }
        catch(Exception e){
            str += "c";
        }
    }
    void B() throws Exception{
        try{
            str+="d";
            C();
        }
        catch(Exception e){
            throw new Exception();
        }
    }
    void C() throws Exception{
        throw new Exception();
    }

    void display(){
        System.out.println(str);
    }
    public static void main(String args[]){
        test1 object = new test1();
        object.A();
        object.display();

    }
}
