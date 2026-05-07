public class maxSubarray {
    public static void main(String[] args) {
        int arr[] = { 1,-2,6,-1,3};
        int currentSum, maxSum = Integer.MIN_VALUE;
        int bestStart = 0, bestEnd = 0;
        for (int i = 0; i < arr.length; i++) {
            currentSum = 0;
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;
                currentSum += arr[j];
                if (currentSum > maxSum) {
                    maxSum = currentSum;
                    bestStart = start;
                    bestEnd = end;
                }
            }
        }
        System.out.println("Max Subarray sum is  = " + maxSum);
        for (int i = bestStart; i <= bestEnd; i++) {
            System.out.print(arr[i]+" ");
        }

    }
}