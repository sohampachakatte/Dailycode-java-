package hw;

import java.util.Arrays;

public class countingsort {
    public static void countingsort(int arr[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }

        int freq[] = new int[largest + 1];
        for (int i = 0; i < arr.length; i++) {
            freq[arr[i]]++;
        }
        int j = 0;
        for (int i = 0; i < freq.length; i++) {
            while (freq[i] > 0) {
                arr[j] = i;
                j++;
                freq[i]--;
            }
        }

    }

    public static void main(String[] args) {
        int arr[] = { 1, 1, 5, 2, 6, 2 };
        countingsort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
