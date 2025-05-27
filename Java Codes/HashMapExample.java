import java.util.*;
class HashMapExample{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        HashMap<Integer,String> map = new HashMap<Integer,String>();
        int bit = 1;
       while(bit == 1){
           System.out.println("Enter id of Student : ");
           int id = sc.nextInt();
           sc.nextLine();
           System.out.println("Enter name of student: ");
           String name = sc.nextLine();
           if(!map.containsKey(id)){
               map.put(id,name);
           }
           System.out.println("Do you want to enter another student information yes(1)/no(0): ");
           bit = sc.nextInt();
       }
    //   for(Integer id : map.keySet()){
    //       System.out.println(map.get(id));
    //   }
    System.out.println("Enter the student id to search: ");
    int searchid = sc.nextInt();
    if(map.containsKey(searchid)){
        System.out.println(map.get(searchid));
    }
    else{
       System.out.println("Invalid id");
    }
    }
}