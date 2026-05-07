package Sorting;

import java.util.Arrays;

public class selectionSort {
    public static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void SelectionSorting(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minPsd = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[minPsd] > arr[j]) {
                    minPsd = j;
                }

            }
            swap(arr, minPsd, i);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 5, 4, 1, 2, 3 };
        SelectionSorting(arr);
        System.out.println(Arrays.toString(arr));
    }
}
