public class Oops2 {
    public static void main(String[] args) {
        Student s1=new Student("Sahil");
        // System.out.println(s1.name);
    }
}

class Student{
     String name;
     int age;

    Student(String name){
        // this.name=name;
        System.out.println("constructor was called");
    }
}
