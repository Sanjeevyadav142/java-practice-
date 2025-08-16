package Question4;
// Question :- Use switch-case to print the day of the week given a number (1-7)
import java.util.Scanner;
public class printingday {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number from 1 to 7 :");
       int day =sc.nextInt();
     switch(day){
        case 1:
        System.out.println("Monday");
        break;
        case 2:
        System.out.println("Tuesday");
        break;
        case 3:
        System.out.println("Wednesday");
        break;
        case 4:
        System.out.println("Thrusday");
        break;
        case 5:
        System.out.println("Friday");
        break;
        case 6:
        System.out.println("Saturday");
        break;
        case 7:
        System.out.println("Sunday");
        break;
        default:
        System.out.println("please enter the value to 1 to 7 !");
        break;
    }
    }
    
}
