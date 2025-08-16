package Question2;
import java.util.Scanner;
public class Simplecalculator {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);// taking the input
        System.out.println("Enter the value of first number = ");
        double num1 = sc.nextDouble();
        System.out.println("Enter the value of second number = ");
        double num2 = sc.nextDouble();
        System.out.println("Enter an operator(+,-,/,*); ");
        char operator = sc.next().charAt(0);// read a single character
        double result;
        // checking the condition for the operator 
        if (operator == '+'){
            result=num1+num2;
            System.out.println("first number + second number = "+result);
        }
        else if(operator == '-'){
            result=num1-num2;
            System.out.println("first number - second number = "+result);
        }
        else if(operator == '/'){
            if (num2!=0){
                result=num1/num2;
                System.out.println("first number / second number = ");
            }
            else{
                System.out.println("Wrong value of num 2");
            }
        }
        else if(operator=='*'){
            result=num1*num2;
            System.out.println("first number * second number = ");
        }
        else{
            System.out.println("Wrong operator");
        }
    }
}
