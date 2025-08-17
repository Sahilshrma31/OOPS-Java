// Example of Multiple Inheritance in Java using Interfaces
public class MultipleInheritance {
    public static void main(String[] args) {
        Bear b = new Bear();
        b.eatsveg();
        b.eatNonVeg();
    }
}

// Interface representing plant-eating behavior
interface Herbivore {
    void eatsveg();
}

// Interface representing meat-eating behavior
interface Carnivore {
    void eatNonVeg();
}

// Bear implements both interfaces → Multiple Inheritance via Interfaces
class Bear implements Herbivore, Carnivore {
    public void eatsveg() {
        System.out.println("Bear eats vegetables");
    }
    public void eatNonVeg() {
        System.out.println("Bear also eats meat and flesh");
    }
}
