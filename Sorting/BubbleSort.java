package Sorting;

import java.util.Arrays;

public class BubbleSort {

    public static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void bubbleSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int swap = 0; // Track if any swaps happened
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                    swap ++; // Mark that a swap occurred
                }
            }
            if (swap == 0) {
                System.out.println("already sorted"); // No swaps = already sorted
                break;
            }

        }
    }

    public static void main(String[] args) {
        int arr[] = { 9, 2, 3, 4, 5 };
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
