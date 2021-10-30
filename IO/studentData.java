import java.util.Scanner;
import java.io.*;
public class studentData {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter student name: ");
        String name = input.nextLine();
        System.out.println("Enter student age: ");
        int age = input.nextInt();
        input.nextLine();
        System.out.println("Enter student phone number: ");
        String phone = input.nextLine();
        input.close();
        try{    
            FileWriter fw=new FileWriter("studentData.txt");    
            fw.write(name + " : " + Integer.toString(age) + " : " + phone + "\n");    
            fw.close();    
            }catch(Exception e){System.out.println(e);}    
        System.out.println("Success..."); 
    }
}