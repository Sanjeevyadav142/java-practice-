package Question2;
// Question :- Write a program to find the maximum and minimum element in an array
public class minmaxelement {
    public static void main(String[] args) {
        int[] number={20,10,30,40,50};// declaring the array and intializing the array
        int max = number[0];
        int min = number[0];
        for(int i=1; i <= number.length; i++){
            if(number[i]>max){ 
                max=number[i];
            }
            if(number[i]<min){
                min=number[i];
            }
        }
        // printing minimum and maximum valur of the array
        System.out.println("Maximum number in the array is :" +max);
        System.out.println("minimum number in the array is :"+min);
    }
}
