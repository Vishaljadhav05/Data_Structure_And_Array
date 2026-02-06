package Array_Programs2;

// Write a program to insert an element at a specific position in an array.
public class InsertInArrayAtSpecificPosition1 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60};

        int position = 3; // Position where the new element will be inserted (1-based index)
        int newElement = 25; // New element to be inserted

        // Check if the position is valid
        if (position < 1 || position > arr.length + 1) {
            System.out.println("Invalid position. Please enter a position between 1 and " + (arr.length + 1));
            return;
        }

        for (int i = arr.length-1; i >= position -1; i--) {
            arr[i] = arr[i-1];
        }
        arr[position -1] = newElement;

        System.out.println("Array after inserting element:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

// Output :-

// Array after inserting element:
// 10 20 25 30 40 50 60
