package loop_in_java_02.thuc_hanh;

import java.util.Scanner;

public class TimUocSoChungLonNhat {
    public static void main(String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập a : ");
        a = sc.nextInt();
        System.out.print("Nhập b : ");
        b = sc.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);
        if (a == 0 || b == 0){
            System.out.println("Lỗi");
        }
        while (a != b){
            if (a > b){
                a = a-b;
            }else {
                b = b-a;
            }
        }
        System.out.println("Uocs chung lớn nhất là : " + a);
    }
}
