# 🧩 Three Dimensional Array in Java

---

## 📌 Types of Arrays
1. **Single Dimensional Array**
   - ➤ 1D Array
2. **Multi-Dimensional Array**
   - ➤ 2D Array
   - ➤ 3D Array
   - ➤ 4D, 5D, 6D, … Arrays
   - ➤ Zig-Zag Array
3. **Anonymous Array**

---

## 📦 Three Dimensional Array (3D Array)

- A **3D array** is an array of arrays of arrays.
- It can be visualized as a **collection of 2D arrays**.
- Representation: **Blocks × Rows × Columns**

---

## 📊 Diagram Representation (Conceptual):


## 🔹 Important Points for 2D Array

### 🧾 Declaration
- For declaring a 3D array, we must use **Triple square brackets `[][][]`**.

#### Valid Declaration: 
```java
1. int[][][] a; //prefered way
2. int[] [][]a;
3. int [][][]a;
4. int []a[][];
5. int [][]a[];
6. int a[][][];
```

#### Cases for Declaration :-
```java
1. int[][][]a, b;    //a & b are 3D array
2. int [][]a[],b;    //a is 3D array & b is 2D array
3. int [][]a[], b[]; //a and b are 3D array
4. int [][][]a, b[]; //a is 3D array & b is 4D array
5. int [][][]a, []b; //❌ error

```
### 🏗️ Creation

-> While creating a 3D array using the **new keyword**, we must provide the size of array.

-> Default values are automatically initialized.

#### Cases for creation :-
```java
1. a=new int[2][2][3]; //✔ correct
2. a=new int[2][2][];  //✔ correct
3. a=new int[2][][];   //✔ correct
4. a=new int[][][];    //❌ error
5. a=new int[2][][3];  //❌ error
```
### 🔍 Retrieval

- We can retrieve the elements of 3D array by using 3 for loops

### 🧠 Points to Remember

📦 Arrays are objects in Java

🧠 Stored in Heap Memory

🔢 Index starts from 0

📐 Size is fixed after creation

🧩 3D arrays can be jagged

❗ At least first dimension size must be specified