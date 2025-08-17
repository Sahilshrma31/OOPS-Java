// Demo of static variable in Java
public class Static {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.schoolName = "dav";   // static var set via s1

        Student s2 = new Student();
        Student s3 = new Student();
        s3.schoolName = "dps";   // changes value for all objects

        System.out.println(s2.schoolName); // prints "dps"
    }
}

class Student {
    String name;
    int age;
    static String schoolName; // shared across all objects

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }

    void setAge(int age) {
        this.age = age;
    }

    int getAge() {
        return this.age;
    }
}

