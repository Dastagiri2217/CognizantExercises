import java.util.*;
class leapYear{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Year : ");
        int n =sc.nextInt();
        //using conditinal statements,bitwise and logical operation to check a year is leap year or not
        if((n%4==0 && n%100!=0)||n%400 ==0){
            System.out.println("The year "+n+" is an Leap year");
        }
        else {
            System.out.println("The year "+n+"is not a  Leap year");
        }
    }
}
