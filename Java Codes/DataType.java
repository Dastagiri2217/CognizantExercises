import java.util.*;
class DataType {
    public static void main(String args[]) {
        int number = 121;
        float decimalNumber = 12.24f;
        char alphabet = 'a';
        boolean flag = true;

        System.out.println("Value: " + number + ", Type: " + ((Object)number).getClass().getSimpleName());
        System.out.println("Value: " + decimalNumber + ", Type: " + ((Object)decimalNumber).getClass().getSimpleName());
        System.out.println("Value: " + alphabet + ", Type: " + ((Object)alphabet).getClass().getSimpleName());
        System.out.println("Value: " + flag + ", Type: " + ((Object)flag).getClass().getSimpleName());
    }
}
