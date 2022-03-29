
//stack implementation using java
//This code was contributed by kavin J
import java.util.*;

class array_sta {
    int n = 100;
    int stack_arr[] = new int[n];
    int top = -1;

    void push(int ele) {
        if (n == top) {
            System.out.println("Stack overflow");
        } else {
            top = top + 1;
            stack_arr[top] = ele;
        }
    }

    void pop() {
        if (top == -1) {
            System.out.println("Stack under flow");
        } else {
            System.out.println("The poped element is " + stack_arr[top]);
            top = top - 1;
        }
    }

    void display() {
        if (top == -1) {
            System.out.println("No elements found");
        } else {
            for (int i = top; i >= 0; i--) {
                System.out.println(stack_arr[i] + " ");
            }
        }
    }
};

public class stack_implementation extends array_sta {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        array_sta stack = new array_sta();
        int choice = 1;
        while (choice != 0) {
            System.out.println("******ENTER YOUR CHOICE******");
            System.out.println("0->EXIT THE PROGRAM");
            System.out.println("1->PUSH INTO THE STACK");
            System.out.println("2->POP INTO THE STACK");
            System.out.println("3->DISPLAY INTO THE STACK");
            System.out.println("*****************************");
            choice = scan.nextInt();
            if (choice == 1) {
                System.out.print("ENTER THE VALUE TO BE PUSHED: ");
                int val = scan.nextInt();
                stack.push(val);
            } else if (choice == 2) {
                System.out.println("------ONE VALUE IS POPED--------");
                stack.pop();
            } else if (choice == 3) {
                System.out.println("$$$$$THE ELEMENTS IN THE STACK IS .....$$$$$$");
                stack.display();
            } else if (choice == 0) {
                System.out.println("####PROGRAM EXITED####");
            } else {
                System.out.println("^^^^INCORRECT CHOICE^^^^^");
            }

        }

    }
}