import java.util.*;
class TypeCasting{
    public static void main(String args[]) {
       double doublenumber  = 12.234;
       int integernumber  = 32;
       int convertedint = (int) doublenumber;
       double converteddouble = (double) integernumber;
       System.out.println("Before Conversion the number in integer is: "+integernumber);
       System.out.println("After Conversion the number in double is: "+converteddouble);
       System.out.println("Before Conversion the number in double is: "+doublenumber);
       System.out.println("After Conversion the number in integer is: "+convertedint);
    }
}
