package day60_collections;

import java.util.Stack;

public class StackObject {
    public static void main(String[] args) {

        Stack<Character> stack = new Stack<>();
        stack.push('a');
        stack.push('b');
        stack.push('c');
        stack.push('d');
        System.out.println(stack);

        System.out.println("-------------------------------");
        System.out.println("TOP of my stack: " + stack.peek()); //TODO: returns what is at the top of your stack

        System.out.println("-------------------------------");
        stack.pop(); //TODO: removing the element at the top of the stack and returns it
        System.out.println(stack);

        System.out.println("-------------------------------");
        System.out.println("TOP of the stack: " + stack.peek()); //TODO: returns what is at the top of your stack

        System.out.println("-------------------------------");
        System.out.println(stack.remove(0)); // TODO: removing the element by the its index; does not follow FIFO role

        System.out.println("-------------------------------");
        System.out.println(stack);


    }
}
