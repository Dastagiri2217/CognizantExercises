import java.util.*;
class NthFibonacci{
    public static int fibnocci(int n){
       if(n==0) return 0;
       if(n==1) return 1;
        return fibnocci(n-1)+fibnocci(n-2);
    }
    public static void main (String args []) {
       Scanner sc = new Scanner (System.in);
       System.out.println("Enter a Number: ");
       int number = sc.nextInt  ();
       System.out.println("The nth fibnoccai number for given number is : "+fibnocci(number));}}
