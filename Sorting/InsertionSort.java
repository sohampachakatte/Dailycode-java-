package Sorting;

import java.lang.reflect.Array;
import java.util.Arrays;

public class InsertionSort {
    public static void InsertionSorting(int arr[]) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int curr = arr[i];
            int prev = i - 1;
            while (prev >= 0 && arr[prev] > curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            arr[prev + 1] = curr;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 5, 4, 1, 2, 3 };
        InsertionSorting(arr);
        System.out.println(Arrays.toString(arr));
    }
}
