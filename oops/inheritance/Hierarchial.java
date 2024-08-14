 

public class Hierarchial {
    public static void main(String[] args) {

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

class Fish extends Animal {
    int fins;

    void swim() {
        System.out.println("swim in water");
    }
}

class Bird extends Animal {
    void fly() {
        System.out.println("can fly");
    }

}