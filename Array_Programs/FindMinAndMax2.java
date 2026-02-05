public class FindMinAndMax2 {
    public static void main(String[] args) {
        int[] arr = {45, 22, 89, 11, 67, 34, 90, 5};
        findMinAndMax(arr);
    
    }

    public static void findMinAndMax(int[] arr) {
        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);    
    }
}

// output:
// Minimum value: 5
// Maximum value: 90
