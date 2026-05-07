public class BinarySearch {
    public static int Binarysearch(int arr[], int key) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 10, 4, 29, 45, 7 };
        int key = 45;
        int index = Binarysearch(arr, key);
        if (index == -1) {
            System.out.println("not found");
        } else {
            System.out.println("found at : " + index);
        }

    }
}
