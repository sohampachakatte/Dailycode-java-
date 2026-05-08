package apncPractice;
public class KadneAlgorithm {
    public static void kadneAlg(int arr[]) {
        int currentSum = 0, tempStart = 0;
        int maxSum = Integer.MIN_VALUE;
        int bestStart = 0, bestEnd = 0;
        for (int i = 0; i < arr.length; i++) {
            currentSum += arr[i];
            if (currentSum > maxSum) {
                maxSum = currentSum;
                bestStart = tempStart;
                bestEnd = i;
            }

            if (currentSum < 0) {
                currentSum = 0;
                tempStart = i + 1;
            }
        }
        System.out.println("maximum sum : " + currentSum);
        System.out.print("Max subarray : ");
        System.out.print("[");
        for (int i = bestStart; i <= bestEnd; i++) {
            System.out.print(arr[i]);
            if (i < bestEnd) {
                System.out.print(",");
            }
        }
        System.out.print("]");
    }

    public static void main(String[] args) {
        int arr[] = { 5, -2, -6, 4, 5 };
        kadneAlg(arr);
    }
}
