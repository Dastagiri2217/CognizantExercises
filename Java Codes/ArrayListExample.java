import java.util.*;
class ArrayListExample{
   public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       ArrayList<String> names = new ArrayList<>();
       do{
           System.out.println("Enter name : ");
           String name  = sc.next();
           names.add(name);
           System.out.println("Do you want to enter another yes/no 1/0");
       }while(sc.nextInt()==1);
       System.out.println("The ArrayList Contains : ");
       for (String name:names){
           System.out.println(name);
       }
   } 
}