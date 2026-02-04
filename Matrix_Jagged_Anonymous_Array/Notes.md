# 🧩 Jagged And Anonymous Array in Java

--

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

## 🧱 Multi-Dimensional Array
👉 A **Multi-Dimensional Array** can be:
- **Matrix Array** 🟦
- **Jagged Array** 🧩

---

## 🟦 Matrix Array
- An array where the **number of rows and columns are fixed** 📏
- Structure is like a proper matrix

### ✅ Example:
```java
int[][] arr = {
    {1, 2, 3},
    {4, 5, 6}
};
```

---

## 🧩 Jagged Array (Zig-Zag Array)
- An array where the **number of columns can vary for each row** 🔀
- Saves memory when rows have different sizes

### ✅ Example:
```java
int[][] arr = new int[3][];
arr[0] = new int[]{1, 2};
arr[1] = new int[]{3, 4, 5};
arr[2] = new int[]{6};
```

📌 Each row can have **different column sizes**!

---

## 🎭 Anonymous Array

### 🔹 Definition
- An **array without a name** is called an **Anonymous Array**

### 🔹 Example:
```java
new int[]{10, 20, 30, 40};
```

### 🔹 Use Cases
- 🕒 Used **only once**
- 🚀 When we want **instant usage**
- 📦 Commonly used as **method arguments**

### 🔹 Example with Method:
```java
static void printArray(int[] arr) {
    for (int x : arr) {
        System.out.println(x);
    }
}

printArray(new int[]{1, 2, 3, 4});
```

### 🔹 Anonymous Array Types
- ✔ Single Dimensional
- ✔ Multi-Dimensional

---


## 🔁 Different Ways to Print / Iterate Array Elements

### 1️⃣ for loop
- Gives **index control** 🔢

### 2️⃣ while loop
- Useful when condition-based looping is required 🔄

### 3️⃣ for-each loop (Enhanced for loop)
```java
for (type var : array) {
    // use var
}
```

---

## ⚠ Limitations of for-each Loop

❌ Does **not track index position**
❌ Iterates only in **forward direction** ➡
❌ Cannot be used to **modify array elements**

---

## 📚 Arrays Class in Java

- Java provides an **`Arrays` class** inside the `java.util` package 📦
- Directly inherits from **Object class**
- Contains **only static methods** ⚡

### 🔹 Common Methods:
- `Arrays.sort()` 🔃
- `Arrays.toString()` 🧾
- `Arrays.equals()` 🤝
- `Arrays.binarySearch()` 🔍
- `Arrays.fill()` 🖌

---

🧠 Points to Remember

1. 📦 Arrays are objects in Java.
2. 🧠 Stored in Heap Memory.
3. 🧩 Jagged arrays save memory.
4. ⚡ Anonymous arrays improve code efficiency for one-time use.

✨ **Tip:** Jagged arrays + anonymous arrays are powerful tools when flexibility and quick execution matter!

Happy Coding! ☕💻🚀

