package introduction_in_java_01.bai_tap;

import java.util.Scanner;

public class UngDungChuyenDoiTienTe {
    public static void main(String[] args) {
        double usd;
        Scanner sc = new Scanner(System.in);
        System.out.print("mời bạn nhập số tiền USD : ");
        usd = sc.nextDouble();
        double quydoi = usd*23000;
        System.out.print("Giá trị Việt Nam đồng là : " + quydoi);
    }
}
