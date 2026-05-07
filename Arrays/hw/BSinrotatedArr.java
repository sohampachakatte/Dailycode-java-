package hw;

import java.util.Arrays;
import java.util.Scanner;

public class BSinrotatedArr {
    static Scanner sc = new Scanner(System.in);

    public static int search(int arr[], int target) {
        int n = arr.length;
        int low = 0, high = n - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (target == arr[mid]) {
                return mid;
            }
            if (arr[low] <= arr[high]) {
                if (arr[low] <= target && arr[mid] > target) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else {
                if (arr[mid] < target && target <= arr[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }

        }
        return -1;
    }

    public static void reverse(int arr[], int left, int right) {
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    public static void rotateArray(int arr[]) {
        int n = arr.length;
        System.out.print("Enter position to rotate : ");
        int k = sc.nextInt();
        k = k % n;
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
        reverse(arr, 0, n - 1);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        rotateArray(arr);
        System.out.println(Arrays.toString(arr));
        System.out.print("Enter Target element : ");
        int target = sc.nextInt();
        int index = search(arr, target);
        System.out.println("Found At index = " + index);
    }
}
