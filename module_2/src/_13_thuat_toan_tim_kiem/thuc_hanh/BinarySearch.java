package _13_thuat_toan_tim_kiem.thuc_hanh;

public class BinarySearch {
    static int[] array = {10, 20, 30, 40, 50, 15, 25, 35, 45, 55};

    static int binarySearch(int[] list, int key) {
        int low = 0;
        int high = list.length - 1;
        while (high >= low) {
            int mid = (low + high) / 2;
            if (key < list[mid])
                high = mid - 1;
            else if (key == list[mid])
                return mid;
            else
                low = mid + 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(binarySearch(array, 30));
    }
}
