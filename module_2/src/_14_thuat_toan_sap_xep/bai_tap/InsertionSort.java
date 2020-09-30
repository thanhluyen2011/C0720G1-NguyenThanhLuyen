package _14_thuat_toan_sap_xep.bai_tap;

import java.util.Arrays;

public class InsertionSort {
    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int currentElement = array[i]; //2
            int k;
            for ( k = i - 1; k >= 0 && array[k] > currentElement; k--) {
                array[k + 1] = array[k];
            }
            System.out.println(Arrays.toString(array));
            array[k + 1] = currentElement;
            System.out.println(Arrays.toString(array));
            System.out.println("xong vòng lặp lần " + i);
        }
    }

    public static void main(String[] args) {
        int[] array = {4,2,8,1,30,6,3};
        System.out.println("mảng chưa thay đổi \t" + Arrays.toString(array));
        insertionSort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
    }
}
