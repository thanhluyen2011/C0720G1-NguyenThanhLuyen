package introduction_in_java_01.bai_tap;

import java.util.Scanner;

public class HienThiLoiChao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên bạn");
        String name = sc.nextLine();
        System.out.println("hello : " + name);
    }
}
