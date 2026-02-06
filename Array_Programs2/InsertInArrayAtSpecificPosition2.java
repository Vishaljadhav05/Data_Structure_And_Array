package Array_Programs2;

public class InsertInArrayAtSpecificPosition2 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60};

        int position = 3; // Position where the new element will be inserted (1-based index)
        int newElement = 25; // New element to be inserted

        int newArr[] = new int[arr.length + 1];

        for (int i = 0; i <arr.length; i++) {
            newArr[i] = arr[i];
        }

        // Check if the position is valid
        if (position < 1 || position > newArr.length + 1) {
            System.out.println("Invalid position. Please enter a position between 1 and " + (arr.length + 1));
            return;
        }

        for (int i = newArr.length-1; i >= position -1; i--) {
            newArr[i] = newArr[i-1];
        }
        newArr[position -1] = newElement;


        System.out.println("Old Array before inserting element:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("\nNew Array after inserting element:");
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
    }
}

// Output :-

// Old Array before inserting element:
// 10 20 30 40 50 60
// New Array after inserting element:
// 10 20 25 30 40 50 60
