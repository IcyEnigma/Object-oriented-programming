import java.util.*;

public class oddeven {
    // find sum of odd and even indexes in an array//
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n%2!=0){
            System.out.println("Enter valid number");
            return;
        }
        if (n % 2 == 0) {
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int odd = 0, even = 0;
            for (int i = 0; i < n; i++) {
                if (i % 2 == 0) {
                    even += arr[i];
                } else {
                    odd += arr[i];
                }
            }
            if (odd > even) {
                for (int i = 0; i < n; i++) {
                    if (i % 2 == 1) {
                        System.out.printf("%d ",arr[i]);
                    }
                }
            } else {
                for (int i = 0; i < n; i++) {
                    if (i % 2 == 0) {
                        System.out.printf("%d ", arr[i]);
                    }
                }
            }

        }
    }
}
