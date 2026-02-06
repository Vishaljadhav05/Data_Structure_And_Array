package Array_Programs2;

// Write a program to find the first duplicate element in an array.
public class FirstDuplicateElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 2, 6, 7, 8, 9, 1};

        //Approach: Using nested loops
        System.out.println("First duplicate element in the array:");

        boolean foundDuplicate = false;

        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                    foundDuplicate = true;
                    break; // To avoid printing the same duplicate multiple times
                }
            }
            if (foundDuplicate) {
                break; // Exit the outer loop once the first duplicate is found
            }
        }
    }
}

// Output :-

// First duplicate element in the array:
// 1

