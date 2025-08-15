# Converting `char` to `int` in Java

## 📌 What happens when you convert `char` to `int`?
In Java, every `char` is internally represented by its **Unicode code point** (which is also the same as ASCII value for basic English letters). When you convert a `char` to an `int`, Java **automatically typecasts** the character into its numeric code value.

---

## ✅ Example Code:

```java
public class CharToInt {
    public static void main(String[] args) {
        char letter = 'A';      // Character 'A'
        int asciiValue = letter; // Implicit typecasting from char to int

        System.out.println("Character: " + letter);
        System.out.println("Converted to int: " + asciiValue);
    }
}
