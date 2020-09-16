package mang_va_phuong_thuc_trong_java_03.bai_tap;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class XoaPhanTuKhoiMang {
    public static void main(String[] args) {
        int []array = {1,2,3,2,5};
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập phần tử muốn xóa");
        int x = sc.nextInt();
        for (int i = 0;i < array.length; i++){
            if (array[i] == x){
                for (int j = i; j < array.length-1;j ++){
                    array[j] = array[j+1];
                }
                array[array.length-1] = 0;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
