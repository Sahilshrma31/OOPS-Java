//shallow copy and deep copy
//shallow copy reflects changes but depe copy does not
public class Oops4 {
 public static void main(String[] args) {
    Dog dobby=new Dog();
    dobby.eat();
    dobby.legs=4;
    System.out.println(dobby.legs);
 }
    
}

//base class
class Animal{
 String color;

 void eat(){
    System.out.println("eats");
 }
 void breathe(){
    System.out.println("breaths");
 }
}

// single level inheritance,derived class/subclass
class Fish extends Animal{
    int fins;

    void swims(){
        System.out.println("swims");
    }

}

//multi-level inheritance
class Mammal extends Animal{
    int legs;
}

//hierarchial inheritance
class Bird extends Animal{
    void fly(){
        System.out.println("fly");
    }
}

class Dog extends Mammal{
    int breed;
}