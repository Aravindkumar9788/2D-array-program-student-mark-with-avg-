class mygrandpa{
    void display(){
        System.out.println("mygrandfather is a farmer");
    }
}
class mydaddy extends mygrandpa{
    void show(){
        System.out.println("my father is a business man");
    }
}
class me extends mydaddy{
    void display(){
        System.out.println("I am a Student");
    }
}
public class Inheritance {
public static void main(String[] args){
    me obj = new me();
    obj.display();
    obj.show();
    obj.display();
}
}
