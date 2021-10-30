import java.io.*;
public class lowerToUpper {
    public static void main(String args[])throws Exception{
        String content = "";   
        FileReader fr=new FileReader("upperLower.txt");    
        int i;    
        while((i=fr.read())!=-1)    
        content += (char)i;   
        fr.close();
        
        FileWriter fw=new FileWriter("upperLower.txt");    
            fw.write(content.toUpperCase());    
            fw.close();

        System.out.println("Success");
    } 
}
