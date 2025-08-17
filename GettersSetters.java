public class GettersSetters {
    public static void main(String[] args) {
        Pen p1=new Pen();//here Pen() is a constructor and it created an object p1
        p1.setColor("blue");
        System.out.println(p1.getColor());
        p1.setColor("yellow");
        System.out.println(p1.getColor());

        BankAccount myAcc=new BankAccount();
        myAcc.username="Sahil";
        myAcc.setPassword("123");
    }
}

//public class ke neechey hi likhna theek rahega ye functions
class BankAccount{
    public String username;
    private String password;

    public void setPassword(String newPass){
        password=newPass;
    }
}


class Pen{
   private String color;
   private int tip;

    //getters function
    String getColor(){
        return this.color;
    }

    String getTip(){
        return this.tip;
    }
    //setters function
    void setColor(String newColor){
        color=newColor;
    }

    void setTip(int newTip){
        tip=newTip;
    }

}

class Student{
    //these are attributes
    String name;
    int age;
    float percentage;//cgpa

        //fucntion for percentage
    void calcPercenatge(int phy,int math,int chem){
        percentage=(math+phy+chem)/3;
    }
}