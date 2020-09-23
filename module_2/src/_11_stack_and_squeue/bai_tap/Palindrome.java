package _11_stack_and_squeue.bai_tap;

import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        String str = "Able was I ere I saw Elba";
        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.toLowerCase().charAt(i));
        }
        for (int i = 0; i < str.length(); i++) {
            queue.add(str.toLowerCase().charAt(i));
        }
        System.out.println(stack);
        System.out.println(queue);
        boolean check = false;
        while (!stack.isEmpty()){
            if (stack.pop() == queue.poll()){
                check = true;
            }else {
                check = false;
                break;
            }
        }
        if (check){
            System.out.println("chuỗi đúng");
        }else {
            System.out.println("chuỗi sai");
        }
    }
}
