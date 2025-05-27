import java.util.*;
class MethodOverloading {
    public static  int add(int n1,int n2){
        return n1+n2;
    }
    public static double add(double n1,double n2){
        return n1+n2;
    }
    public static int add(int n1,int n2,int n3){
        return n1+n2+n3;
    }
    public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
    System.out.println("Enter the choice : 1.add2integers\t2.add2doubles\t3.add3integes");
    int choice =  sc.nextInt();
    switch(choice){
        case 1:System.out.println("Enter two Integer Numbers :");
               int number1 = sc.nextInt();
               int number2 = sc.nextInt();
               System.out.println("result is  :"+add(number1,number2));
               break;
        case 2:System.out.println("Enter two Double Numbers :");
               double d1 = sc.nextDouble();
               double d2 = sc.nextDouble();
               System.out.println("result is  :"+add(d1,d2));
               break;
        case 3:System.out.println("Enter three Integer Numbers :");
               int n1 = sc.nextInt();
               int n2 = sc.nextInt();
               int n3 = sc.nextInt();
               System.out.println("result is  :"+add(n1,n2,n3));
               break;
    }
    }
}
