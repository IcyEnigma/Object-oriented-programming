import java.util.*;

public class sortingStrings{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] names = new String[n];
        for(int i = 0; i < n; i++){
            names[i] = sc.next();
        }
        sc.close();
        Arrays.sort(names);
        System.out.println("\nSorted names:");
        for(int i = 0; i < n; i++){
            System.out.println(names[i]);
        }
    }
}