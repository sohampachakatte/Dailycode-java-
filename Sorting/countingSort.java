import java.util.Arrays;

public class countingSort {
    public static void countingSort(int arr[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }

        int count[] = new int[largest + 1];

        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }
        int j = 0;
        for (int k = 0; k < count.length; k++) {
            while (count[k] > 0) {
                arr[j] = k;
                j++;
                count[k]--;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 5, 4, 1, 2, 3 };
        countingSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
