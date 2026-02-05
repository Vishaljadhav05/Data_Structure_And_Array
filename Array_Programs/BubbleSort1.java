public class BubbleSort1 {

    public static void main(String[] args) {
        String[] arr = {"Vishal", "Ram", "Prafull", "Sakshi", "Komal", "Aman", "Aaditya"};
        bubbleSortString(arr);
        System.out.println("Sorted array:");
        printArray(arr);
    }

    public static void bubbleSortString(String[] arr) {
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if(arr[j].compareTo(arr[j+1]) >0){
                    // swap arr[j] and arr[j+1]
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            // If no two elements were swapped in the inner loop, then break
            if (!swapped) break;
        }
    }

    public static void printArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void printArray(String[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

// Output:
// Sorted array:
// Aaditya Aman Komal Prafull Ram Sakshi Vishal