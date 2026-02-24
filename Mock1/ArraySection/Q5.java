package Mock1.ArraySection;

import java.util.Stack;

// Leader Element
public class Q5 {
    public static void main(String[] args) {
        int[] arr = {16,17,4,3,5,2};
        int n = arr.length;
        Stack<Integer> stack = new Stack<>();
        for(int i=n-1;i>=0;i--){
            if(stack.isEmpty()){
                stack.push(arr[i]);
            }
            else if(arr[i]>stack.peek()){
                stack.push(arr[i]);
            }
        }
        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }
}
