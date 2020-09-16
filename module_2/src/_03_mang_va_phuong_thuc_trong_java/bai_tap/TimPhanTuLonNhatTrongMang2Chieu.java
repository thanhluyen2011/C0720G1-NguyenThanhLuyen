package mang_va_phuong_thuc_trong_java_03.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class TimPhanTuLonNhatTrongMang2Chieu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập độ dài mảng");
        int x = sc.nextInt();
        System.out.println("Nhập độ rộng mảng con");
        int y = sc.nextInt();
        double[][] array = new double[x][y];
        for (int i = 0; i < x; i++){
            for (int j = 0; j < y; j++){
                System.out.println("Nhập phần tử mảng tại vị trí " + i + ','+ j);
                array[i][j] = sc.nextInt();
            }
        }
        double max = array[0][0];
        for (int i = 0; i < x; i++){
            for (int j = 0; j < y; j++){
                if (array[i][j] > max){
                    max = array[i][j];
                }
            }
        }
        System.out.println("phần tử lớn nhất là " + max);
    }
}
