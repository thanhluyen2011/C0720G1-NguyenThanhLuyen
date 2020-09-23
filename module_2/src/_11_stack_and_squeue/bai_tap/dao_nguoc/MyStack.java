package _11_stack_and_squeue.bai_tap.dao_nguoc;

import java.util.Collections;
import java.util.Stack;

public class MyStack {
    public static void main(String[] args) {
        Stack<Integer> listStack = new Stack<>();
        Integer[] integers = {1,2,3,4,5};
        for (int i = 0; i < integers.length; i++) {
            listStack.push(integers[i]);
        }
        System.out.println(listStack);
        Stack<Integer> temp = new Stack<>();
        while (!listStack.isEmpty()){
            temp.push(listStack.pop());
        }
        listStack = temp;
//        Collections.reverse(listStack);
        System.out.println(listStack);
    }
}
