package Question3;
//Question :- Print the multiplication table of 5 using a do-while loop
public class tableof5usingdoloop {
    public static void main(String[] args) {
        int num=5;// number which tabel we want
        int i = 1;// starting 
        do{
            System.out.println(num+" x "+i+" = "+num*i);
            i++;
        }while(i<=10);//loop ends when it reach to 10
    }
}
