import java.util.Scanner;

public class StackOperation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int size, choice, value;
        System.out.print("Enter Stack Size: ");
        size = sc.nextInt();

        int[] stack = new int[size];
        int top = -1;

        do {
            System.out.println("\n1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Exit");
            System.out.print("Enter Choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    if (top == size - 1) {
                        System.out.println("Stack Overflow");
                    } else {
                        System.out.print("Enter Value: ");
                        value = sc.nextInt();
                        top++;
                        stack[top] = value;
                        System.out.println(value + " Inserted");
                    }
                    break;

                case 2:
                    if (top == -1) {
                        System.out.println("Stack Underflow");
                    } else {
                        System.out.println(stack[top] + " Removed");
                        top--;
                    }
                    break;

                case 3:
                    if (top == -1) {
                        System.out.println("Stack is Empty");
                    } else {
                        System.out.println("Top Element = " + stack[top]);
                    }
                    break;

                case 4:
                    if (top == -1) {
                        System.out.println("Stack is Empty");
                    } else {
                        System.out.println("Stack Elements:");
                        for (int i = top; i >= 0; i--) {
                            System.out.println(stack[i]);
                        }
                    }
                    break;

                case 5:
                    System.out.println("Program Ended");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        } while (choice != 5);

        sc.close();
    }
}
