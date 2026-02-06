package Array_Programs2;

public class EvenAndOddCount {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 2, 6, 7, 8, 9, 1};

        int evenCount = 0;
        int oddCount = 0;

        for(int i = 0; i < arr.length; i++) {
           if(arr[i] % 2 == 0)
            {
               evenCount++;
               System.out.println(arr[i] + " is even");
            } 
            else 
            {
               oddCount++;
               System.out.println(arr[i] + " is odd");
            }
        }

        System.out.println("================================");
        System.out.println("Even numbers: " + evenCount);
        System.out.println("Odd numbers: " + oddCount);
    }
}

// Output :-

// 1 is odd
// 2 is even
// 3 is odd
// 4 is even
// 5 is odd
// 2 is even
// 6 is even
// 7 is odd
// 8 is even
// 9 is odd
// 1 is odd
// =================================
// Even numbers: 5
// Odd numbers: 6

