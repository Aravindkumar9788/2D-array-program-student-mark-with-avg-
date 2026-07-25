class student {
     // private data member
     private int id;
     private String name;
     //Setter methods 
     public void setId(int id){
         this.id = id;
         }
 public void setName(String name) {
     this.name = name;
 }
 public int getId(){
     return id;
     }
     public String getName(){
         return name;
             
         }
 }
         public class Main{
             public static void main(String[] args){
             student s = new student();
             s.setId(101);
             s.setName("Deepan");
             System.out.println("ID ;" +s.getId());
             System.out.println("Name ;" +s.getName());
         }
 }
