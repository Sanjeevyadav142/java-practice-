# Java Programs using Methods

This repository contains three Java programs that demonstrate the use of methods:

---

## 1. Add Two Numbers Using a Method
### **Description:**
A program to add two integers using a separate method.

**Code:**
```java
public class AddNumbers {

    // Method to add two numbers
    public static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        int sum = add(num1, num2);

        System.out.println("The sum is: " + sum);
    }
}
