public class TwoDArrayDemo {
    public static void main(String[] args) {
        // Declare and initialize a 2D array
        int[][] array = {
            {10, 20, 30},
            {40, 50, 60},
            {70, 80, 90}
        };

            System.out.println(array);
        
    }
}

//Output :--
// [[I@15db9742

// [[ : Indicates that this is a two-dimensional array of integers.
// I  : Indicates that the array holds integers.
// @15db9742 : This is the hashcode of the array object, which will vary each time you run the program.


// Explanation: The output shows the type and hashcode of the 2D array object, not its contents.
// This is because when printing an array directly, Java uses the default toString() method from the Object class.
// To print the contents of the array, you would need to iterate through its elements, as shown in the TwoDArray.java example.
