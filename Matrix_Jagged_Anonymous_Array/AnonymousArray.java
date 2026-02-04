package Matrix_Jagged_Anonymous_Array;

// When an array is created without a name, it is known as an anonymous array.
// Anonymous arrays are useful when you want to pass an array to a method without explicitly declaring it
// when we use anonymous array, we can directly pass the array to the method without creating a separate variable for it.

public class AnonymousArray {
    public static void main(String[] args) {
        // Creating and passing an anonymous array to the method
        printSum(new int[]{10, 20, 30, 40, 50});
    }

    static void printSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Sum of array elements: " + sum);
    }
}
