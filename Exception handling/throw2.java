import java.io.*;

public class throw2{
    public static void method() throws FileNotFoundException{
        FileReader file = new FileReader("C:\\random-test-folder");
        BufferedReader fileInput = new BufferedReader(file);
        throw new FileNotFoundException();
    }
    public static void main(String args[]){
        try{
            method();
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
        System.out.println("Rest of the code...");
    }
}