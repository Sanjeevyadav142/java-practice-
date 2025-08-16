package Question3;
// Question :- Check if a given year is a leap year or not
import java.util.Scanner;
public class LeapyearorNot {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year number :");
        int year = sc.nextInt(); // taking input
        // condition checking
        if(year%4==0){
            System.out.println("The given year is a leap year");
        }
        else{
            System.out.println("The given year is not a leap year");
        }
    }
}
