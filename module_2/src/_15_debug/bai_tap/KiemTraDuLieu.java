package _15_debug.bai_tap;

import java.util.Scanner;

public class KiemTraDuLieu {
    public static int check() {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        boolean check = false;
        while (!check) {
            try {
                System.out.println("Nhập");
                n = sc.nextInt();
                check = true;
            } catch (Exception e) {
                System.out.println("ban nhap sai kieu du lieu !");
                sc.nextLine();
            }
        }
        return n;
    }

    public static void main(String[] args) {
        System.out.println(check());
    }
}
