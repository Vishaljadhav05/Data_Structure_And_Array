package Array_Programs2;

public class DeleteInArrayAtSpecificPosition {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60};

        int position = 3; // Position of the element to be deleted (1-based index)

        // Check if the position is valid
        if (position < 1 || position > arr.length) {
            System.out.println("Invalid position. Please enter a position between 1 and " + arr.length);
            return;
        }

        for (int i = position - 1; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = 0; // Optional: Set the last element to 0 after deletion

        System.out.println("Array after deleting element:");
        for (int i = 0; i < arr.length - 1; i++) { // Print up to length-1 since one element is deleted
            System.out.print(arr[i] + " ");
        }
    }
}

// Output :-

// Array after deleting element:
// 10 20 40 50 60
