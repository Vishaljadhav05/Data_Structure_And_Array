package Matrix_Jagged_Anonymous_Array;

public class WaysToPrintArray {
    public static void main(String[] args) {
        // Method 1: Using a for loop
        int[] arr1 = {1, 2, 3, 4, 5};
        System.out.print("Array using for loop: ");

        for (int i = 0; i < arr1.length; i++)
        {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
        System.out.println("---------------------------------------------");

        //Iterate the elements in reverse order
        System.out.print("Array in reverse order: ");
        for (int i = arr1.length - 1; i >= 0; i--)
        {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
        System.out.println("---------------------------------------------");

        //Method 2: Using for while loop (Not genrally used but for demonstration)
        int[] arrWhile = {16, 17, 18, 19, 20};
        System.out.print("Array using while loop: ");   
        int i = 0;
        while (i < arrWhile.length)
        {
            System.out.print(arrWhile[i] + " ");
            i++;
        }
        System.out.println();

        System.out.println("---------------------------------------------");


        // Method 3: Using for each loop
        int[] arr2 = {6, 7, 8, 9, 10};
        System.out.print("Array using for each loop: ");

        for (int num : arr2) 
        {
            System.out.print(num + " ");
        }
        System.out.println();
        
        System.out.println("---------------------------------------------");


        // Method 4: Using Arrays.toString() method
        int[] arr3 = {11, 12, 13, 14, 15};
        System.out.println("Array using Arrays.toString(): " + java.util.Arrays.toString(arr3));
    }
}

//Output:

//Array using for loop: 1 2 3 4 5
//---------------------------------------------
//Array using while loop: 16 17 18 19 20
//---------------------------------------------
//Array using for each loop: 6 7 8 9 10
//---------------------------------------------
//Array using Arrays.toString(): [11, 12, 13, 14, 15]