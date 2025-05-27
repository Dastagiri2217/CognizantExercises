import java.util.*;
class TryCatchExample{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers : ");
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        try{
            float result = number1/number2;
        }
        catch(ArithmeticException e){
            e.printStackTrace();
            System.out.println("Enter non zero denominator");
        }
        catch(Exception e){
            e.printStackTrace();
            System.out.println("Try and check input type");
        }
    }
}