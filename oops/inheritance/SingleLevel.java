

public class SingleLevel {
//     public static void main(String[] args) {
//         Fish katla = new Fish();
//         katla.eat();
//     }
// }

// class Animal {
//     String color;

//     void eat() {
//         System.out.println("eats");
//     }

//     void breath() {
//         System.out.println("breaths");
//     }
// }

// class Fish extends Animal {
//     int fins;

//     void swim() {
//         System.out.println("swim in water");
//     }
// }
    public static void main(String[] args) {
        Vechiles v=new Car();
         
        v.print();
    }
     
}
class Vechiles{
    int tier;
    String name;
    void print(){
        System.out.println("print base class");
    }
}
class Car extends Vechiles{
    int range;
    String brand;
    void print1(){
        System.out.println("print child class");
    }
}