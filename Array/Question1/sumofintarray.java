package Question1;
//Question :- Declare an array of integers and find the sum of all elements
public class sumofintarray {
    public static void main(String[] args) {
        int[] number={34,54,64,60}; // array declaration and intialization
        int sum = 0;
        for(int i = 0; i < number.length; i++){
            sum+=number[i];
        }
        // printing sum
        System.out.println("sum of the array :" +sum);
    }
}
