import java.util.*;
class GuessNumber {
    public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       Random rand = new Random();
       int randomNumber  = rand.nextInt(101);
       //System.out.println(randomNumber);
       while(true){
         System.out.println("Guess a number between 0 to 100");
         int guess = sc.nextInt();
         if(guess == randomNumber) {
            System.out.println("Guess is Correct");
            return;}
        if(guess>randomNumber){
          System.out.println("Guess is too high than required number");
        }
        else{
          System.out.println("Guess is too low than required number");
        }
       }
    }
    
}
