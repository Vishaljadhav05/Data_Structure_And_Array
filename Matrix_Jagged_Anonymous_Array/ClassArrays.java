package Matrix_Jagged_Anonymous_Array;

import java.util.Arrays;
//Arrays class dirctly inherits from Object class
public class ClassArrays {
    public static void main(String[] args) 
    {
        int[] arr = {21, 22, 23, 24, 25};
        Arrays.sort(arr);

        for (int num : arr) 
        {
            System.out.print(num + " ");
        }
    }
    
}

//Output:

//21 22 23 24 25
