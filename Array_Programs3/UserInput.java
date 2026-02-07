package Array_Programs3;

// This program demonstrates how to take user input for an array in Java. It prompts the user to enter the size of the array and then the elements of the array. Finally, it displays the elements entered by the user.

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }   

        System.out.println("The elements of the array are:");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}

// output :-

// Enter the size of the array:5
// Enter the elements of the array:
// 10
// 20
// 30
// 40
// 50
// The elements of the array are:
// 10 20 30 40 50
