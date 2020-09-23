package _11_stack_and_squeue.bai_tap;

import java.util.Scanner;
import java.util.Stack;

public class NhiPhan {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number:");
        int number = scanner.nextInt();
        while (number != 0){
            int temp = number%2;
            stack.push(temp);
            number /= 2;
        }
        while(!(stack.isEmpty())){
            System.out.print(stack.pop());
        }
    }
}
