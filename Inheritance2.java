// Base class
class Animal {
    void eat() {
        System.out.println("Animal eats food");
    }
}

// ---- Birds hierarchy ----
class Bird extends Animal {
    void fly() {
        System.out.println("Bird can fly");
    }
}

class Sparrow extends Bird {
    void sound() {
        System.out.println("Sparrow chirps");
    }
}

// ---- Mammals hierarchy ----
class Mammal extends Animal {
    void walk() {
        System.out.println("Mammal can walk");
    }
}

class Human extends Mammal {
    void speak() {
        System.out.println("Human can speak");
    }
}

class Dog extends Mammal {
    void bark() {
        System.out.println("Dog barks");
    }
}

class Cat extends Mammal {
    void meow() {
        System.out.println("Cat meows");
    }
}

// ---- Fish hierarchy ----
class Fish extends Animal {
    void swim() {
        System.out.println("Fish can swim");
    }
}

class Shark extends Fish {
    void attack() {
        System.out.println("Shark attacks");
    }
}

// ---- Interface to show multiple inheritance ----
interface Pet {
    void play();
}

class PetDog extends Dog implements Pet {
    public void play() {
        System.out.println("Pet dog loves to play");
    }
}

// Main class
public class Inheritance2 {
    public static void main(String[] args) {
        Sparrow sp = new Sparrow();
        sp.eat();
        sp.fly();
        sp.sound();

        Human h = new Human();
        h.eat();
        h.walk();
        h.speak();

        Shark sh = new Shark();
        sh.eat();
        sh.swim();
        sh.attack();

        PetDog pd = new PetDog();
        pd.eat();
        pd.walk();
        pd.bark();
        pd.play();
    }
}
