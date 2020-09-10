package mang_va_phuong_thuc_trong_java_03.bai_tap;

import java.util.Scanner;

public class DemSoLanXuatHienCuaKyTuTrongChuoi {
    public static void main(String[] args) {
        String str = "hello code gym";
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập ký tự muốn kiểm tra");
        String st = sc.nextLine();
        char ch = st.charAt(0);
        int count = 0;
        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) == ch){
                count++;
            }
        }
        System.out.println("Số lần xuất hiện trong chuỗi là " + count);
    }
}
