import java.util.*;
class Animal{
    public void makeSound(){
        System.out.println("Animal Sounds");
    }
}
class Dog extends Animal{
    @Override
    public void makeSound(){
         System.out.println("Bark");
        return;
    }
}
// class Cat extends Animal{
//      @Override
//     public void makeSound(){
//         System.out.println("Meow");
//     }
// }
class Inheritance{
    public static void main(String args[]){
        Animal  an = new Animal();
        an.makeSound();
        Dog d = new Dog();
        d.makeSound();
        // Cat c = new Cat();
        // c.makeSound();
    }
}