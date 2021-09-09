//get an array input from the user and add the second largest and second smallest number of the array and print the sum

import java.util.Scanner;


public class arrayExample {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = input.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }
        input.close();
        int sum = 0;
        int smallest = array[0];
        int largest = array[0];
        for (int i = 0; i < size; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
            }
            if (array[i] > largest) {
                largest = array[i];
            }
        }
        sum = smallest + largest;
        System.out.println("The sum is : " + sum);
    }
}
