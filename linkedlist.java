class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = next;
    }
    }
    public class linkedlist{
        static Node head;
        static void insertEnd(int data)
        {
            Node newNode=new Node(data);
            if(head==null)
            {
                head = newNode;
                return;
            }
            Node temp = head;
            while(temp.next!=null)
            {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        static void display(){
            Node temp = head;
            while(temp!=null)
    {
        System.out.println(temp.data+"");
        temp = temp.next;
    }
        }
        public static void main(String[] args){
            insertEnd(10);
            insertEnd(20);
            insertEnd(30);
            display();
        }
    }
