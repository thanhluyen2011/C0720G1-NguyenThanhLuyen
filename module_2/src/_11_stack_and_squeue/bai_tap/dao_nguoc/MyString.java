package _11_stack_and_squeue.bai_tap.dao_nguoc;

import java.util.Stack;

public class MyString {
    public static void main(String[] args) {
        String mWork = "thanh luyen";
        Stack<Character> listStack = new Stack<>();
        for (Character i = 0; i < mWork.length(); i++) {
            listStack.push(mWork.charAt(i));
        }
        for (int i = 0; i < mWork.length(); i++) {
            System.out.print(listStack.pop());
        }
    }
}
