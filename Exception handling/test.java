class test extends Exception {}
class Derived extends test{}
class Main{
    public static void main(String args[])
    {
        try{
            throw new Derived ();
        }
        catch(Derived d )
        {
            System.out.println("DErived class");
        }
        catch(test t)
        {
            System.out.println("Base class");
        }
    }
}
