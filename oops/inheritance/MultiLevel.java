public class MultiLevel {
    public static void main(String[] args) {
        Dog puppy = new Dog();
        puppy.eat();
        puppy.color = "blue";
        puppy.legs = 4;
        System.out.println(puppy.color);
        System.out.println(puppy.legs);
    }
}

class Animal {
    String color;

    void eat() {
        System.out.println("eats");
    }

    void breadth() {
        System.out.println("breadth");
    }
}

class Mammal extends Animal {
    int legs;
}

class Dog extends Mammal {
    String breed;
}