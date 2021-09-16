class Building{
    Building(){
        System.out.println("Building");
    }
    Building(String name){
        this();
        System.out.println("Building: String Constructor " + name);
    }
}


public class House extends Building{
    House(){
        System.out.println("House");
    }
    House(String name){
        this();
        System.out.println("house: String Constructor "+name);
    }
    public static void main(String args[]){
        new House("Hello");
    }
}
