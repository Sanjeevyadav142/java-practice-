package Question3;
//Question :- Reverse an array
public class reverseingarrar {
    public static void main(String[] args) {
        int[] arr={20,30,40,100,50};// declaring an array and intializing the array
        int n = arr.length;
        //printing original array
        for(int i = 0 ; i<=n;i++){
            System.out.println( +arr[i] +" ");

        }
           // Reversing the array
        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - 1 - i];
            arr[n - 1 - i] = temp;
        }

        System.out.println("\nReversed Array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
