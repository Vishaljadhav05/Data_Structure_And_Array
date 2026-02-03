# 🧩 Two Dimensional Array in Java

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

## 📘 Two Dimensional Array (2D Array)

- A **2D array** is an array of arrays.
- It stores data in **rows and columns**.
- Syntax representation: `rows × columns`

<img width="1099" height="503" alt="1 Representation of 2d array" src="https://github.com/user-attachments/assets/0f52049f-72d0-43e0-93c8-cad6c868ffcb" />

---

## 🔹 Important Points for 2D Array

### 🧾 Declaration
- For declaring a 2D array, we must use **double square brackets `[][]`**.

```java
int[][] a;
```

### 🏗️ Creation

-> While creating a 2D array using the **new keyword**, we must provide the size of array.

-> Default values are automatically initialized.

```java
a = new int[2][3]; // 2 rows and 3 columns
```

### 👉 Declaration & creation in a single line:

```java
int[][] a = new int[2][3];
```

### ✍️ Initialization

- Values can be assigned using index positions.

```java
a[0][1] = 100; // assigns 100 at row 0, column 1
```
<img width="1101" height="637" alt="2" src="https://github.com/user-attachments/assets/666d8504-0242-4e45-ba6b-047e697bbc82" />

<img width="1109" height="671" alt="3" src="https://github.com/user-attachments/assets/2d12c3a4-fa0b-4831-a9a1-6e4f811a4d6e" />

<img width="1116" height="612" alt="4" src="https://github.com/user-attachments/assets/61f5d89a-a50c-48aa-843e-4cfeee6d1135" />

## 👉 Declaration, creation, and initialization in a single line:

```java
int[][] a = { {10, 20, 30}, {40, 50, 60} };
```
### 🔍 Retrieval

- Elements can be accessed using nested for loops.

### ✅ Valid Declaration :-
    1. int[][] a; //prefered way
    2. int [][]a;
    3. int[][]a;
    4. int [][] a;
    5. int []   a    [];

### ⚠️ Cases for Declaration
    1. int [][]a, b;    // a → 2D array, b → 2D array
    2. int a[][], b;    // a → 2D array, b → normal variable
    3. int []a[], b;    // a → 2D array, b → 1D array
    4. int []a[], b[];  // a → 2D array, b → 2D array
    5. int [][]a, b[];  // a → 2D array, b → 3D array
    6. int [][]a, []b;  // ❌ compile-time error

### 🏗️ Cases for Creation
    1. a = new int[2][3];   // ✔ correct
    2. a = new int[][];     // ❌ compile-time error (dimension missing)
    3. a = new int[2][];    // ✔ correct (jagged array)
    4. a = new int[][3];    // ❌ compile-time error

### 🧩 Creation in a Single Line
    1. int[][] a = new int[2][3];   // ✔ correct
    2. int[][] a = new int[2][];    // ✔ correct
    3. int[][] a = new int[][];     // ❌ error
    4. int[][] a = new int[0][0];   // ✔ correct
    5. int[][] a = new int[-2][3];  // ❌ runtime exception : will compile successfully but provides runtime exception saying java.lang.NegativeArraySizeException

### 🧠 Points to Remember

📦 Arrays are objects in Java

🧠 Stored in Heap Memory

🔢 Index starts from 0

📐 Size is fixed after creation

🧩 2D arrays can be jagged (unequal column size)
