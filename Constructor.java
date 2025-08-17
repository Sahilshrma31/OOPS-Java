//copy contructor
public class Constructor {
public static void main(String[] args) {
    Student s1=new Student();
    s1.name="sahil";
    s1.age=20;
    s1.pass="abcd";
    s1.marks[0]=100;
    s1.marks[1]=80;
    s1.marks[2]=90;
    

    Student s2=new Student(s1);//copy
    s2.pass="xyz";
    s1.marks[2]=5;//still new marks will be shown on the printed array
    for(int i=0;i<3;i++){
        System.out.println(s2.marks[i]);
    }
}
}

class Student{
    String name;
    int age;
    String pass;
    int marks[];
    
    Student(){
        System.out.println("constructor was called!");
        marks=new int[3];
    }

    // Student(Student s1){//shallow copy constructor
    //   marks=new int[3];
    //   this.name=s1.name;
    //   this.age=s1.age;
    //   this.marks=s1.marks;
    // }

    //deep copy constructor
    Student(Student s1){
        marks=new int[3];
        this.name=s1.name;
        this.age=s1.age;
         for(int i=0;i<3;i++){
            marks[i]=s1.marks[i];
        }

    }
    Student(String name){
        this.name=name;
        marks=new int[3];
    }
    Student(int age){
        this.age=age;
        marks=new int[3];
    }
   
}