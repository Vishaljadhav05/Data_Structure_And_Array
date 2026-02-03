package Three_Dimentional_Array;

public class ThreeDArrayDemo {
    public static void main(String[] args) {
        int[][][] a = {
            {{1, 2, 3},{4, 5, 6}},
            {{7, 8, 9},{10, 11, 12}},
            {{13, 14, 15}, {16, 17, 18}}
        };


        System.out.println(a);          // Output: [[[I@xxxxxxx
        System.out.println(a[1]);       // Output: [[I@xxxxxxx
        System.out.println(a[0][0]);    // Output: [I@xxxxxxx
        System.out.println(a[0][0][0]); // Output: 1

        System.out.println("----------------------");

        System.out.println(a.length);          // Output: 3
        System.out.println(a[0].length);       // Output: 2
        System.out.println(a[0][0].length);    // Output: 3 
        System.out.println(a[0][2]);        // Output: Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 3


    }
}

// Output:
// [[[I@15db9742
// [[I@6d06d69c 
// [I@7852e922
// 1

// ----------------------
// 3
// 2
// 3
// Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 2
