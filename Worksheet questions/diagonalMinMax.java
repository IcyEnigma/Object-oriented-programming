import java.util.Scanner;

public class diagonalMinMax {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        sc.close();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            if(arr[i][i] < min){
                min = arr[i][i];
            }
            if(arr[i][i] > max){
                max = arr[i][i];
            }
        }
        System.out.println("Smallest Element - 1: " + min);
        System.out.println("Largest Element - 1: " + max);
        min = Integer.MAX_VALUE;
        max = Integer.MIN_VALUE;
        int col;
        for(int i = 0; i < n; i++){
            col = n-1-i;
            if(arr[i][col] < min){
                min = arr[i][col];
            }
            if(arr[i][col] > max){
                max = arr[i][col];
            }
        }
        System.out.println("Smallest Element - 2: " + min);
        System.out.println("Largest Element - 2: " + max);
    }
}
        
        

