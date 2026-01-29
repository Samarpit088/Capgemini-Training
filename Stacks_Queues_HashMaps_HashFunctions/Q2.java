package Stacks_Queues_HashMaps_HashFunctions;

import java.util.*;

// Sort a Stack Using Recursion
public class Q2 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(3);
        stack.push(1);
        stack.push(4);
        stack.push(2);
        sortStack(stack);
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }
    public static void sortStack(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            return;
        }
        int top = stack.pop();
        sortStack(stack);
        insertSorted(stack, top);
    }
    private static void insertSorted(Stack<Integer> stack, int element) {
        if (stack.isEmpty() || stack.peek() <= element) {
            stack.push(element);
            return;
        }
        int top = stack.pop();
        insertSorted(stack, element);
        stack.push(top);
    }
}

