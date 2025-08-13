# Java Operators Demonstration

This repository contains Java programs demonstrating:
1. **Arithmetic Operators**
2. **Using the Modulus Operator to Check Even Numbers**
3. **Using Logical Operators to Check if a Number Lies Between 10 and 20**

---

## 1️⃣ Arithmetic Operators in Java
Arithmetic operators perform mathematical operations on variables and values.

| Operator | Description       | Example (`a = 10`, `b = 5`) | Result |
|----------|------------------|----------------------------|--------|
| `+`      | Addition         | `a + b`                    | 15     |
| `-`      | Subtraction      | `a - b`                    | 5      |
| `*`      | Multiplication   | `a * b`                    | 50     |
| `/`      | Division         | `a / b`                    | 2      |
| `%`      | Modulus (Remainder) | `a % b`                 | 0      |

**Example Code:**
```java
public class ArithmeticExample {
    public static void main(String[] args) {
        int a = 10, b = 5;
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));
    }
}
