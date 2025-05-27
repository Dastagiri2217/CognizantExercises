import java.util.*;
class ArraySumAvg {
    public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a Array Size :");
       int size  = sc.nextInt();
       //Declaring the array Size
       int arr[] = new int[size+1];
       System.out.println("Enter the Number into the Array : ");
       int sum = 0;
       for(int i=0;i<size;i++){
           arr[i] = sc.nextInt();
           sum += arr[i];
       }
       System.out.println("Sum of all Array elements is : "+sum);
       System.out.println("Average is : "+(float)(sum/size));
    }
}
