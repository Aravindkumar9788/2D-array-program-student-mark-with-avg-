class Student {
    int rollNo;
    String name;
    String dept;
    String section;
    int year;
    Student(int rollNo,String name,String dept,String section,int year){
        this.rollNo=rollNo;
        this.name=name;
        this.dept=dept;
        this.section=section;
        this.year=year;
    }
    void display(){
        System.out.println("Roll No;"+rollNo);
        System.out.println("Name;"+name);
        System.out.println("Dept;"+dept);
        System.out.println("Section;"+section);
        System.out.println("Year;"+year);
        System.out.println();
    }
}
public class Main{
    public static void main(String[] args){
        Student[] student=new Student[3];
        Student s1=new Student(101,"Alice","CSE","A",1);
        student[0]=s1;
        Student s2=new Student(102,"Bob","ECE","B",2);
        student[1]=s2;
        student[2]=new Student(103,"Charlie","IT","A",4);
        for (int i=0;i<student.length;i++)
        student[i].display();
    }
}
