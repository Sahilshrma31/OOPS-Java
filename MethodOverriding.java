// Parent class
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Child class overriding method
class Dog extends Animal {
    @Override
    void sound() {   // same name, parameters, return type
        System.out.println("Dog barks");
    }
}

// Another child class
class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Animal a1 = new Dog();  // runtime polymorphism
        Animal a2 = new Cat();

        a1.sound();  // Dog's version will run
        a2.sound();  // Cat's version will run
    }
}
