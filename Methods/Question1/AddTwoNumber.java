package Question1;
import java.util.Scanner; // importing Scanner
public class AddTwoNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number :");// getting values from user
        int number1 = sc.nextInt();
        System.out.println("Enter second number :");
        int number2 = sc.nextInt();
        sum(number1,number2); // Calling method and storing result
        
    }
    public static void sum(int a , int b){
       int sum = a+b;
      System.out.println("sum is :" +sum);
    }
}
