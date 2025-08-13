//Question:-- Use logical operators to check if a number lies between 10 and 20 
package Question3;

import java.util.Scanner;

public class check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num >= 10 && num <= 20) {
            System.out.println(+num + " This number lies between 10 and 20");
        } else {
            System.out.println(+num + " This number does not lies in between 10 and 20");
        }

    }
}
