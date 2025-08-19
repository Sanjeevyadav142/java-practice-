package Question2;
//Write a method to check whether a number is odd or even
import java.util.Scanner;
public class OddOrEven {
    public static void primeornot(int a) {
        if(a%2==0){
            System.out.println("This number is even and the number is :--"+a);
        }
        else{
            System.out.println("This give number is odd and the number is :--"+a);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Give the number you want to check :-- ");
        int number = sc.nextInt();// taking input
        primeornot(number);// calling function
    }
}
