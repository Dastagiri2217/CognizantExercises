import java.util.*;
// class StringReversal{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the String : ");
//         char str[] = sc.next().toCharArray();
//         int length = str.length;
//         int i = 0,j=length-1;
//         while(i<j){
//             char temp = str[i];
//             str[i] = str[j];
//             str[j] = temp;
//             i++;
//             j--;
//         }
//         System.out.println("Reversed String is : "+new String(str));
//     }
// }
//The above code is Using loops and Below code is Suing StringBuilder
class StringReversal{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String str = sc.next();
        int length = str.length()-1;
        StringBuilder sb = new StringBuilder();
        for(int i = length;i>=0;i--){
            sb.append(str.charAt(i));
        }
        //Time = O(n) Space = O(n);
        System.out.println("Reversed String is : "+sb.toString());
    }
}