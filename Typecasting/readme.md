# Java Typecasting Examples

This document explains **typecasting in Java** with clear examples.  
Typecasting means **converting one data type into another**. It can be:
- **Explicit (Manual)** – When the programmer specifies the type to convert.
- **Implicit (Automatic)** – When Java automatically converts the type.

---

## ✅ 1. Convert `float` to `int` and show the output

When converting a `float` to an `int`, Java **truncates** the decimal part (removes it without rounding).

### 🔹 Example:

```java
public class FloatToIntExample {
    public static void main(String[] args) {
        float number = 9.75f;          // Float value
        int converted = (int) number;  // Explicit typecasting

        System.out.println("Original float: " + number);
        System.out.println("Converted int: " + converted);
    }
}
