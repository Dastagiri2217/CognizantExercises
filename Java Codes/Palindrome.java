import java.util.*;
// class Palindrome{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the Input String : ");
//         String str = sc.next();
//         String newstr = str.replaceAll("[0-9]","");
//         String res =newstr.toLowerCase();
//         System.out.println("reversed Stirng is : "+res);
//         String reversed = new StringBuilder(res).reverse().toString();
//         if(reversed.equals(res)){
//             System.out.println("Palindrome");
//         }
//         else{
//             System.out.println("Not an Palindrome");
//         }
//     }
// }
class Palindrome{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Input String : ");
        String str = sc.next();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(!Character.isDigit(ch)){
               sb.append(Character.toLowerCase(ch));
            }
        }
        String org = sb.toString();
        String reversed = new StringBuilder(org).reverse().toString();
        if(reversed.equals(org)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not an Palindrome");
        }
    }
}