package Array_Programs2;

// Write a program to find duplicate elements in an array.
public class DuplicateElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 2, 6, 7, 8, 9, 1};

        //Approach 1: Using nested loops
        System.out.println("Duplicate elements in the array (Way 1):");

        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                    break; // To avoid printing the same duplicate multiple times
                }
            }
        }

        //Approach 2: sorting the array first and then checking for duplicates
        System.out.println("Duplicate elements in the array (Way 2):");
        java.util.Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-1-i;j++) {

                if (arr[j] > arr[j+1]) 
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
                
            }
        }

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                System.out.println(arr[i]);
            }
        }
    }
}


// Output :-

// Duplicate elements in the array (Way 1):
// 1
// 2
// Duplicate elements in the array (Way 2):
// 1
// 2

