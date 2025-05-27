import java.util.*;
interface Playable{
    public void play();
}
class Guitar implements Playable{
    public void play(){
        System.out.println("Guitar Playing");
    }
}
class  Piano implements Playable{
    public void play(){
        System.out.println("Piano is Playing");
    }
}
class Interface{
    public static void main(String args[]){
       Guitar gt = new Guitar();//Guitar class instance 
       Piano pn = new Piano();//Paino Class instance
       gt.play();
       System.out.println();
       pn.play();
    }
}