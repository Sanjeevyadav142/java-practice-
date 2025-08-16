package Question1;
//Question :- Write a program to check if a number is positive, negative, or zero
import java.util.Scanner;
public class NegativeOrPositiveOrZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of the number you want to check");
        int num = sc.nextInt();// taking input
        //condition check
        if (num < 0 ){
            System.out.println("This number is positive = "+num);
        }
        else if (num > 0){
            System.out.println("This number is negative = "+num);
        }
        else{
            System.out.println("This number is zero = "+num);
        }

    }
    
}
