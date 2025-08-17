// Class to demonstrate Method Overloading
class Sum {
    // Method 1: add two integers
    int add(int a, int b) {
        return a + b;
    }

    // Method 2: add three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method 3: add two doubles
    double add(double a, double b) {
        return a + b;
    }
}

public class MethodOverloading {
    public static void main(String[] args) {
        Sum s = new Sum();

        System.out.println("Sum of 2 integers: " + s.add(10, 20));
        System.out.println("Sum of 3 integers: " + s.add(10, 20, 30));
        System.out.println("Sum of 2 doubles: " + s.add(5.5, 4.5));
    }
}
