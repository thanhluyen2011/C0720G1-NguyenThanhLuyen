package loop_in_java_02.thuc_hanh;

import java.util.Scanner;

public class UngDungTinhTienLaiChoVay {
    public static void main(String[] args) {
        double money = 0;
        int month = 1;
        double interset_rat = 1.0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số tiền");
        money = sc.nextDouble();
        System.out.println("Nhập tháng vay");
        month = sc.nextInt();
        System.out.println("Nhập lãi xuất");
        interset_rat = sc.nextDouble();
        double total_interset = 0;
        for (int i = 0; i < month; i++){
            total_interset = money * (interset_rat/100/12) * 3;
        }
        System.out.println("Tiền lãi là : " + total_interset);
    }
}
