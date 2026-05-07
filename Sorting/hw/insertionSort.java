package hw;

import java.util.Arrays;

public class insertionSort {

    public static void insertionsorting(int arr[]) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int current = arr[i];
            int prev = i - 1;
            while (prev >= 0 && arr[prev] < current) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            arr[prev + 1] = current;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 3, 6, 2, 1, 8, 7, 4, 5, 3, 1 };
        insertionsorting(arr);
        System.out.println(Arrays.toString(arr));

    }
}
