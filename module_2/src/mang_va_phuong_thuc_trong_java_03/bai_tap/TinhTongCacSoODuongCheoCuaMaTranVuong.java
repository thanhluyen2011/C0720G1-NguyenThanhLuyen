package mang_va_phuong_thuc_trong_java_03.bai_tap;

import java.util.Scanner;

public class TinhTongCacSoODuongCheoCuaMaTranVuong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập độ dài của ma trận vuông");
        int n = sc.nextInt();
        float[][] array = new float[n][n];
        for (int i = 0;i < n;i++){
            for (int j = 0;j < n; j++){
                System.out.println("Nhập phần tử" + i + " " + j);
                array[i][j] = sc.nextFloat();
            }
        }
        float sum = 0.0f;
        float sum1= 0.0f;
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                if (i == j){
                    sum += array[i][j];
                }
            }
        }
        System.out.println("Tổng các phần tử đường chéo là " + sum);
    }
}
