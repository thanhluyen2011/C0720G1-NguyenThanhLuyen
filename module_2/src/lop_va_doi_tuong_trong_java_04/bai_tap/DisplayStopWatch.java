package lop_va_doi_tuong_trong_java_04.bai_tap;

import java.util.Arrays;

public class DisplayStopWatch {
        public static void sort(int arr[]) {
            int n = arr.length;

            // One by one move boundary of unsorted subarray
            for (int i = 0; i < n-1; i++)
            {
                // Find the minimum element in unsorted array
                int min_idx = i;
                for (int j = i+1; j < n; j++)
                    if (arr[j] < arr[min_idx])
                        min_idx = j;

                // Swap the found minimum element with the first
                // element
                int temp = arr[min_idx];
                arr[min_idx] = arr[i];
                arr[i] = temp;
            }
        }
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.star();
        int[] array = new int[100000];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100000);
        }
        sort(array);
        //System.out.println(Arrays.toString(array));
        stopWatch.end();
        System.out.println(stopWatch.getElapsedTime() + "ms");
    }
}
