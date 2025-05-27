import java.util.*;
import java.io.*;
class ReadTask{
    public static void main(String args[]){
        try{
        BufferedReader br = new BufferedReader(new FileReader("output.txt"));
        String line;
        System.out.println("Output file contains");
        while((line = br.readLine())!=null){
            System.out.println(line);
        }
        br.close();
        }
        catch(IOException e){
            System.out.println("Error occured while reading");
            e.printStackTrace();
        }
    }
}