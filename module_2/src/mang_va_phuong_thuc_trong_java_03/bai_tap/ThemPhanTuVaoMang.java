package mang_va_phuong_thuc_trong_java_03.bai_tap;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ThemPhanTuVaoMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập độ dài mảng");
        int N = sc.nextInt();
        System.out.println("Nhập số cần chèn");
        int x = sc.nextInt();
        System.out.println("Nhập vị trí chèn");
        int index = sc.nextInt();
        int[] array = new int[N];
        for (int i = 0; i < array.length; i++){
            System.out.println("Nhập phần tử thứ " + i);
            array[i] = sc.nextInt();
        }
        for (int j = array.length-1; j >= index; j--){
            if (j == index){
                array[j] = x;
                break;
            }
            array[j] = array[j - 1];
        }
        System.out.println(Arrays.toString(array));
    }
}
