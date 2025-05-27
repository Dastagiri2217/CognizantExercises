import java.util.*;
class Factorial {
    public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a Number :");
       int number = sc.nextInt();
       if(number<=0){
           System.out.println("Enter valid positive integer");
           return;
       }
       long fact = 1;
    for(int i=1;i<=number;i++){
        fact *= i;
    }
       System.out.println("The factorial of the given number "+number+" is: "+fact);
    }
}
