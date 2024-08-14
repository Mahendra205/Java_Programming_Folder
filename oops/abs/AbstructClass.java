
 

public class AbstructClass {
    public static void main(String[] args) {
    Horse h=new Horse();
    Chicken c=new Chicken();
    c.changeColor(); 
    h.eat();
    h. walk();
    c.eat();
    c.walk();
   
}
}
abstract class Animal{
    //abstrct class can have constructor
    String color ;
    Animal(){
        System.out.println("brown");
    }
    void eat(){
        System.out.println("animal eat");
    }
    abstract void walk();
}
class Horse extends Animal{

     
    void changeColor(){
        color="red";
    }
    void walk(){
        System.out.println("walk in 4 legs");
    }
}
class Chicken extends Animal{
    void changeColor(){
        color="red";
    }
    void walk(){
        System.out.println("walk in 2 legs");
    }
}
