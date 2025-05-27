import java.util.*;
class LambdaExp{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<String>();
        int flag =1;
        while(flag == 1){
            System.out.println("Enter a name");
            String name = sc.nextLine();
            list.add(name);
            System.out.println("Do you want to enter another name if yes type 1 or else enter 0:");
            flag = sc.nextInt();
            sc.nextLine();
        }
        System.out.println();
        Collections.sort(list,(a,b)->a.compareTo(b));
        System.out.println("The Sorted List is: ");
        for(String name : list){
            System.out.println(name);
        }
    }
}