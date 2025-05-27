import java.util.*;
class SimpleCalculator{
    public static void arithmeticOperation(int n1,int n2,int choice){
        switch(choice){
            case 1: System.out.println("Addition of "+n1+" and "+n2+" is : "+(n1+n2));
                  break;
            case 2:System.out.println("Subtraction of "+n1+" and "+n2+" is : "+Math.abs(n1-n2));
                  break;
            case 3:System.out.println("Multiplication of "+n1+" and "+n2+" is : "+(n1*n2));
                  break;
            case 4:
                if(n2!=0){
                System.out.println("Division of "+n1+" and "+n2+" is : "+((float)n1/n2));
                 break;
                }
                else{
                    System.out.println("Enter non zero denominator");
                    break;
                }
            default : System.out.println("Enter valid Operation");  }
    } 
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two Numbers : ");
        int n1 =sc.nextInt();
        int n2 = sc.nextInt();
        //assuming user entering same length of both numbers i.e 100 then 999 not 1000
   System.out.print("Enter the Operation to perform as 1.Addition\t2.Subtraction\t3.Multiplication\t4.Division\n");
        int choice = sc.nextInt();
        arithmeticOperation(n1,n2,choice);
        System.out.println("Completed ");
    }
}
