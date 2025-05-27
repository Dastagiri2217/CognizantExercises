import java.util.*;
import java.io.*;
class WriteTask{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String to write into file: ");
        String ip = sc.nextLine();
        try{
            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
            writer.write(ip);
            writer.close();
            System.out.println("Data Succesfully written into the file");
        }
        catch(IOException e){
            System.out.println("Error happen data transfer failed");
            e.printStackTrace();
        }
    }
}