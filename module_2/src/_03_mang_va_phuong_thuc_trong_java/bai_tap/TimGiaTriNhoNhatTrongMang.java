package mang_va_phuong_thuc_trong_java_03.bai_tap;

import java.lang.reflect.Array;
import java.util.Scanner;

public class TimGiaTriNhoNhatTrongMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập độ dài mảng");
        int n = sc.nextInt();
        int []array = new int[n];
        for (int i = 0; i < n; i++){
            System.out.println("Nhập phần tử thứ " + i);
            array[i] = sc.nextInt();
        }
        int min = array[0];
        for (int j = 1; j < n; j++){
            if (array[j] < min ){
                min = array[j];
            }
        }
        System.out.println("Giá trị nhỏ nhất của mảng là " + min);
    }
}
