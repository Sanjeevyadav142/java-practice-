package Question2;
// Question :- Calculate the factorial of a number using a while loop
import java.util.Scanner;
public class factorialwhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value : ");
        int num = sc.nextInt();
        int fact=1;
        int i = 1;
        if(num>0){
        while(i<=num){
            fact*=i;
            i++;
        }
        System.out.println("factorial is : "+fact);  
        }
     else{
        System.out.println("enter the value more then 0");
    }
    
    }
    
}
