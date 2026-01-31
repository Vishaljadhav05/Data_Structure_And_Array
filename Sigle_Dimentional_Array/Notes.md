# Single Dimensional Array in Java

## Types of Arrays
1. **Single Dimensional Array**
   - 1D Array
2. **Multi-Dimensional Array**
   - 2D Array
   - 3D Array
   - 4D, 5D, 6D, … Arrays
   - Zig-Zag Array
3. **Anonymous Array**

---

## Single Dimensional Array (1D Array)

- In this type of array, there is only **one row or one column**.
- A 1D array stores elements in a **linear sequence**.

---

## Common Points for Arrays

### 🔹 Declaration
1. An array can be declared like a normal variable, but we must use **square brackets `[]`**.
2. While declaring an array, **size is not required**.

### 🔹 Creation
1. When creating an array using the `new` keyword, **size must be provided**.
2. When an array is created using `new`, **all index positions are initialized with default values**.

=> We can declare and create an array within a single line.

### 🔹 Initialization
1. Values can be assigned to specific index positions.
2. Declaration, creation, and initialization can be done **in a single line**.

### 🔹 Retrieval
1. Array elements can be retrieved using a **for loop** or enhanced for loop.

---

## Declaration, Creation & Initialization — Different Cases

### ✅ Declaration

    1. int[] a,b;   //a and b are both arrays
    2. int []a,b;   //a and b both are arrays
    3. int a[],b;   //correct, a is an array but b is simple variable
    4. int a,b[];   //correct, a is normal variable but b is an array
    5. int a[], b[];     //both a and b are array
    6. int []a, b[];    //a and b are both arrays
    7. int a,[]b;       // compile time error


### ✅ Creation

    1. a=new int[5];            //correct
    2. a=new int[];             //error
    3. int[] a=new int[5];      //correct
    4. int a[]=new int[5];      //correct
    5. int []a=new [5]int;      //error
    6. int[] a=new int[0];      //it will successfully compile and run
    7. int[] a=new int[-3];     //it will compile but provides runtime exception i.e. java.lang.NegativeArraySizeException


### ✅ Declaration
    1. int[] a=new int[3];
        a[3]=100; //compile successfully but will throw runtime exception saying ArrayIndexOutOfBoundsException.

    2. If we dont initialize any proper index position value, then it will compile and run successfully

    3. a[-1]=100; //compile successfully but will provide runtime exception saying ArrayIndexOutOfBoundsException


### ✅ Points to remember :-
    1. Array are Objects in java
    2. Arrays are stored in "Heap Area"

### ✅ Interview Questions :-
    1. Difference between declaring, creating and initializing an array with and without using new keyword.
        -> When we create an array without using new keyword then default value will not be initialized in the array, all the values will be initlized automatically in the array.