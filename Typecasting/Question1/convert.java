package Question1;
// Question:- Convert float to int and show the output.
public class convert {
    public static void main(String[] args) {
        float num = 9.75f; //
        // f because by default java takes decimal values as a double that is the reason for using f at the end
        System.out.println("float number :-  "+num);
        int converted = (int) num;//explicit typecasting
        System.out.println("float after converted into int :-  "+converted);
    }
}
