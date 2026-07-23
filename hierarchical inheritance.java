class mydaddy{
    void display(){
        System.out.println("my father is a farmer");
    }
}
class mysister extends mydaddy{
    void show(){
        System.out.println("my sister is a teacher");
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
    mysister sis = new mysister();
    obj.display();
    sis.show();
    obj.display();
}
}

