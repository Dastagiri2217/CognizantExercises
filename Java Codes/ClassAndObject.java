import java.util.*;
class Car{
    String make;
    String model;
    int year;
    public Car(String make,String model,int year){
        this.make = make;
        this.year = year;
        this.model = model;
    }
    public void displayDetails(){
        System.out.println("Manfacturer is  : "+make);
        System.out.println("Model is : "+model);
        System.out.println("Year is :"+year);
    }
}
class ClassAndObject{
    public static void main(String args[]){
        Car c1 = new Car("Toyato","mustang",2020);
        c1.displayDetails();
        Car c2 = new Car("Mahindra","Thor",2024);
        c2.displayDetails();
    }
}