import java. util.*; 
class GradeCalculator {
    public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the marks of student (0-100): ");
       int marks = sc.nextInt();
       char Grade ='\0';
       if(marks<0 || marks > 100){
         System.out.println("Enter valid marks");
       }
       else{
       if(marks >=90 && marks<=100){
         Grade = 'A';
       }
       else if(marks>=80){
         Grade = 'B';
       }
       else if(marks>=70){
         Grade = 'C';
       }
       else if(marks>=60){
         Grade = 'D';
       }
       else{
         Grade = 'F';
       }
       System.out.println("Grade of student for marks "+marks+" is: "+Grade);
       }
    }
}
