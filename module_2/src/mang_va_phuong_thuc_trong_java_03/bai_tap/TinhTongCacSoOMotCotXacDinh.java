package mang_va_phuong_thuc_trong_java_03.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class TinhTongCacSoOMotCotXacDinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập độ dài dòng");
        int a = sc.nextInt();
        System.out.println("Nhập độ dài cột");
        int b = sc.nextInt();
        float[][] array = new float[a][b];
        for (int i = 0;i < a;i++){
            for (int j = 0;j < b; j++){
                System.out.println("Nhập phần tử" + i + j);
                array[i][j] = sc.nextFloat();
            }
        }
        System.out.println("Bạn muốn tính tổng ở cột thứ mấy");
        int x = sc.nextInt();
        double sum = 0.0;
        for (int i =0; i < a; i++){
            for (int j = 0; j < b; j++){
                if ( j == x){
                    sum += array[i][j];
                }
            }
        }
        System.out.println("Tổng của cột " + x + " là " + sum );
    }
}
