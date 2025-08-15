package Question2;
// Question:- Write a program that takes int input and typecasts it to double.
import java.util.Scanner;
public class intintodouble {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number =");
        int num = sc.nextInt();
        double coverted =(double)num;
        System.out.println("The Number Before Conversion = "+num);
        System.out.println("The Number After Conversion = "+coverted);
    }
}
