//Question:-- Demonstrate the use of arithmetic operators in Java.
public class Question1{
    public static void main(String[] args) {
        int a = 4;
        int b = 2;
        int addition = a+b;
        int substraction = a-b;
        int multiplication = a*b;
        int division = a/b;
        int modulus = a%b;
        int incriment = a++;
        int decriment = a--;
        System.out.println("value of a"+a);
        System.out.println("value of b"+b);
        System.out.println("Value after using addition operator:-"+addition);
        System.out.println("Value after using substraction operator:-"+substraction);
        System.out.println("Value after using multiplication operator:-"+multiplication);
        System.out.println("Value after using division operator:-"+division);
        System.out.println("Value after using modulus(Remainder) operator:-"+modulus);
        System.out.println("Value after using Incriment operator:-"+incriment);
        System.out.println("Value after using Decriment operator:-"+decriment);
    }
}