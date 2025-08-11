package Question2;
// Questiob 2 --Swap two numbers using a third variable
// Answer
public class swaptwonumbers {
    public static void main(String[] args) {
        int a = 60;
        int b = 40;
        int temp;
        // Before swapping
        System.out.println("valuse of a before swapping:-" + a);
        System.out.println("valuse of b before swapping:-" + b);
        //swapping using third variable
        temp = a;
        a = b;
        b = temp;
        // after swapping
        System.out.println("valuse of a after swapping:-" + a);
        System.out.println("valuse of b after swapping:-" + b);

    }

}
