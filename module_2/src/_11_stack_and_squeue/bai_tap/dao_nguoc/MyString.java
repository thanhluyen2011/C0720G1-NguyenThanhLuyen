package _11_stack_and_squeue.bai_tap.dao_nguoc;

import java.util.Stack;

public class MyString {
    public static void main(String[] args) {
        String mWork = "thanh luyen";
        Stack<Character> listStack = new Stack<>();
        for (int i = 0; i < mWork.length(); i++) {
            listStack.push(mWork.charAt(i));
        }
        System.out.println(listStack);
        Stack<Character> temp = new Stack<>();
        while (!listStack.isEmpty()){
            temp.push(listStack.pop());
        }
        listStack = temp;
        System.out.println(listStack);

    }
}
