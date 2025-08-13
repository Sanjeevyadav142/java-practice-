//Question:-- Write a program to check if a number is even using the modulus operator.
package Question2;
import java.util.Scanner;
public class evenornot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of the number");
        int num = sc.nextInt();
        if ((num%2)==0)
        {
            System.out.println(+num+" is even");
        }
        else
        {
            System.out.println(+num+ " is odd ");
        }
    }
    
}
