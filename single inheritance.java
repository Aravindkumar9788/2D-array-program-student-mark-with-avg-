class Parent{
    void display(){
        System.out.println("This is the Parent class.");
    }
}
class child extends Parent{
    void show(){
        System.out.println("This is the child class.");
    }
}
public class Inheritance {
public static void main(String[] args){
    child obj = new child();
    obj.display();
    obj.show();
}
}
