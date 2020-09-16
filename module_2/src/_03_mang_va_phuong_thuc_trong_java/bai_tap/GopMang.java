package mang_va_phuong_thuc_trong_java_03.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[5];
        int[] array1 = new int[4];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Nhập phần tử thứ " + i + " của mảng thứ nhất");
            array[i] = sc.nextInt();
        }
        for (int j = 0; j < array1.length; j++) {
            System.out.println("Nhập phần tử thứ " + j + " của mảng thứ hai");
            array1[j] = sc.nextInt();
        }
        int[] array2 = new int[9];
        int x = array.length;
        for (int i = 0; i < array.length; i++){
            array2[i] = array[i];
        }
        for (int j = 0; j < array1.length; j++){
            array2[x] = array1[j];
            x++;
        }
        System.out.println(Arrays.toString(array2));
    }
}
