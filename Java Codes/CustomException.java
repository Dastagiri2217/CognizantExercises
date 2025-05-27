import java.util.*;
class InvalidAgeException extends Exception{
    public InvalidAgeException(String report){
        super(report);
    }
}
class CustomException{
    public static void checkAge(int age) throws InvalidAgeException{
        if(age<18){
            throw new InvalidAgeException("User age is less than 18");
        }
        else{
            System.out.println("Age is valid");
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age : ");
        int age  = sc.nextInt();
        try{
            checkAge(age);
        }
        catch(InvalidAgeException e){
            System.out.println("Exception caught \n"+e);
        }
    }
}