import java.util.*;
public class sortingbylen {
    //input a set of strings and sort them by length//
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] str = new String[n];
        for(int i=0;i<n;i++){
            str[i] = sc.next();
        }
        Arrays.sort(str, new Comparator<String>(){
            public int compare(String s1, String s2){
                return s1.length() - s2.length();
            }
        });
        for(int i=0;i<n;i++){
            System.out.printf("%s ",str[i]);
        }
    }
}
