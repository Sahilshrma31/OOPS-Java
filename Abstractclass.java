
public class Abstractclass {
    public static void main(String[] args) {
        // Create a Horse object
        Horse h = new Horse();
        h.eat();   // calls the eat() method from Animal (inherited)
        h.walk();  // calls overridden walk() method from Horse

        // Create a Chicken object
        Chicken c = new Chicken();
        c.eat();   // calls the eat() method from Animal (inherited)
        c.walk();  // calls overridden walk() method from Chicken
    }
}

// Abstract class Animal (cannot be directly instantiated)
abstract class Animal {
    String color;

    Animal(){
        System.out.println("animal c called");
    }

    // Concrete method: shared by all animals
    void eat() {
        System.out.println("animal eats");
    }

    // Abstract method: must be implemented by child classes
    abstract void walk();
}

// Horse extends Animal and provides its own version of walk()
class Horse extends Animal {
    Horse(){
        System.out.println("horse c called");
    }
    void changeColor(){
        color="dark brown";
    }
    void walk() {
        System.out.println("walks on 4 legs");
    }
}

// Chicken extends Animal and provides its own version of walk()
class Chicken extends Animal {
     void changeColor(){
        color="yellow";
    }
    void walk() {
        System.out.println("walks on 2 legs");
    }

    class Mustang extends Horse{
        Mustang(){
            System.out.println("Mustang c calledreyt 9");
        }
    }
}
