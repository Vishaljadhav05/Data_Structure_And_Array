package Three_Dimentional_Array;

public class ThreeDArray {
    public static void main(String[] args) {
        int[][][] threeDArray = {
            {
                {1, 2, 3},
                {4, 5, 6}
            },
            {
                {7, 8, 9},
                {10, 11, 12}
            },
            {
                {13, 14, 15},
                {16, 17, 18}
            }
        };

        // Accessing elements in the 3D array
        System.out.println("Element at [0][1][2]: " + threeDArray[0][1][2]); // Output: 6
        System.out.println("Element at [2][0][1]: " + threeDArray[2][0][1]); // Output: 14

        // Iterating through the 3D array
        for (int i = 0; i < threeDArray.length; i++) 
        {
            for (int j = 0; j < threeDArray[i].length; j++) 
            {
                for (int k = 0; k < threeDArray[i][j].length; k++) 
                {
                    System.out.print(threeDArray[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}

// Output:
// Element at [0][1][2]: 6 
// Element at [2][0][1]: 14
// 1 2 3
// 4 5 6
//
// 7 8 9
// 10 11 124
//
// 13 14 15
// 16 17 18  