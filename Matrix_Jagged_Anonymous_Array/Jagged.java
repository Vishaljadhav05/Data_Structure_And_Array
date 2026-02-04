package Matrix_Jagged_Anonymous_Array;

public class Jagged {
    public static void main(String[] args) {
        int[][] jaggedArray = new int[3][];
        jaggedArray[0] = new int[4]; // First row has 4 columns
        jaggedArray[1] = new int[3]; // Second row has 3 columns
        jaggedArray[2] = new int[5]; // Third row has 5 columns

        jaggedArray[0][0] = 10;

        int[][] a= {
            {10, 20, 30, 40},
            {50, 60, 70},
            {80, 90, 100, 200, 300}
        };

        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}

// Output:-

// 10 0 0 0 
// 0 0 0 
// 0 0 0 0 0
// 10 20 30 40
// 50 60 70
// 80 90 100 200 300