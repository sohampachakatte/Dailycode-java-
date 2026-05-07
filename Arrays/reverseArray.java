import java.util.Arrays;

public class reverseArray {
    public static void reversearray(int arr[]) {
        int end = arr.length - 1;
        int start = 0;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        reversearray(arr);
    }
}
