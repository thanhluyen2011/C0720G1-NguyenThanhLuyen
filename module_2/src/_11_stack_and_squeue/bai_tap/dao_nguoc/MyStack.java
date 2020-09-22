package _11_stack_and_squeue.bai_tap.dao_nguoc;

import java.util.List;
import java.util.Stack;

public class MyStack {
    public static void main(String[] args) {
        Stack<Integer> listStack = new Stack<>();
        listStack.push(1);
        listStack.push(2);
        listStack.push(3);
        listStack.push(4);
        listStack.push(5);
        while (!listStack.isEmpty()){
            System.out.println(listStack.pop());
        }
    }
}
