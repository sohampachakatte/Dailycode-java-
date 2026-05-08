package apncPractice;

import java.util.concurrent.ForkJoinPool;

public class maxSuarraysum {
    public static void maxSubarraySum(int arr[]) {
        int maxSum = Integer.MIN_VALUE, Beststart = 0, Bestend = 0;
        int sum;
        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;
                sum = 0;
                for (int k = start; k <= end; k++) {
                    sum += arr[k];
                }
                if (sum > maxSum) {
                    maxSum = sum;
                }
            }
        }
        System.out.println("Sum of max subarray : " + maxSum);
    }

    public static void main(String[] args) {
        int arr[] = { 5, -2, -6, 4, 5 };
        maxSubarraySum(arr);
    }
}
