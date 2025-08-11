package Question4;

// Question 4: What happens if you declare a variable and don’t initialize it?
// Answer: It depends where you declare the variable — inside a method (local variable),
// or as an instance/static variable inside a class
public class Variable {

    static class Test {
        // Instance Variables (Inside a Class)
        int a;       // default value 0
        double b;    // default value 0.0
    }

    public static void main(String[] args) {
        // Local variable
        // int num; // declared but not initialized
        // System.out.println(num); // ERROR: variable num might not have been initialized

        Test obj = new Test();
        System.out.println(obj.a); // prints 0
        System.out.println(obj.b); // prints 0.0
    }
}