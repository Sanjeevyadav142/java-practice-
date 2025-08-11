package Question1;
// Question 1 -- Declare and initialize variables of all primitive data types in Java
// Answer
class primitive{
    public static void main(String[] args) {
        int myInt = 40 ;
        long myLong = 3000l;
        // By default, any whole number you type without a suffix (like 1000) is treated as an int (32-bit integer).
        // If the value is within the range of int (-2,147,483,648 to 2,147,483,647), Java will allow it without a suffix — even if you assign it to a long
        char myChar = 'g';
        byte myByte =100 ;
        float myFloat = 8.8f ;
        // f and the end in java is because java stores decimal value in 
        // in double by default so it consider 8.8 as a float this the reason 
        // we use f at the end
        double myDouble = 3.6;
        boolean myBollean = true;
        
        short myShort =30000;
       System.out.println("integer value:- "+ myInt);
       System.out.println("long value:-"+ myLong);
       System.out.println("char datatype:- "+myChar);
       System.out.println("byte datatype:- "+myByte);
       System.out.println("float datatype:- "+myFloat);
       System.out.println("double datatype:- "+myDouble);
       System.out.println("boolean datatype:- "+myBollean);
    }
}