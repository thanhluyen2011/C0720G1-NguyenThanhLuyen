package mang_va_phuong_thuc_trong_java_03.thuc_hanh;

public class TimGiaTriNhoNhatTrongMangSuDungPT {
    public static int minValue(int[] array) {
        int max = array[0];
        int vitri = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                vitri = i;
            }
        }
        return vitri;
    }

    public static void main(String[] args) {
        int[] arr = {4, 12, 7, 8, 1, 6, 9};
        int index = minValue(arr);
        System.out.println("The smallest element in the array is: " + arr[index]);
    }
}