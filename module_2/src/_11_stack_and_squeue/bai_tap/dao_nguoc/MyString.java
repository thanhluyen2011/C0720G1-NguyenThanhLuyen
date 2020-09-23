package _11_stack_and_squeue.bai_tap.dao_nguoc;

import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.Stack;

public class MyString {
    public static void main(String[] args) {
        Stack<String> stringStack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập chuỗi");
        String[] mWord = scanner.nextLine().split(" ");
        for (int i = 0; i < mWord.length; i++) {
            stringStack.push(mWord[i]);
        }
        Stack<String> stringStackTemp=new Stack<>();
        System.out.println("trước" + stringStack);
        while (!stringStack.isEmpty()) {
            stringStackTemp.push(stringStack.pop());
        }
        stringStack=stringStackTemp;
        System.out.println("sau"+stringStack);
//        Stack<Character> listStack = new Stack<>();
//        for (int i = 0; i < mWork.length(); i++) {
//            listStack.push(mWork.charAt(i));
//        }
//        System.out.println(listStack);
//        Stack<Character> temp = new Stack<>();
//        while (!listStack.isEmpty()){
//            temp.push(listStack.pop());
//        }
//        listStack = temp;
//        System.out.println(listStack);

    }
}
