import java.util.*;
public class ArrayListDemo {
    public static void main(String[] args){
        ArrayList<Integer> al = new ArrayList<Integer>();

        for(int i=0; i<=5; i++){
            al.add(i);
        }
        System.out.println(al);

        al.remove(3);
        System.out.println(al);
        int len = al.size(), i=0;

        while(len-- != 0){
            System.out.println(al.get(i));
            i++;
        }
    }
}
