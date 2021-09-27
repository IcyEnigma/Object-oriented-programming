class A{
    public A(String s){
        System.out.println("A");
    }
}

class B extends A{
    public B(String s){
        super(s);
        System.out.println("B");
    }
    public static void main(String[] args){
        new B("C");
        System.out.println(" ");
    }
}