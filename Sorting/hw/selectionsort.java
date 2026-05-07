package hw;

import java.util.Arrays;

public class selectionsort {
    public static void selectionsorting(int arr[]){
        int n = arr.length;
        for(int i = 0 ; i < n - 1 ; i++){
            int minIndex = i;
            for(int j = i + 1 ; j < n ; j++ ){
                if(arr[minIndex] < arr[j]){
                    minIndex  = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex]  = arr[i];
            arr[i] = temp;
        }
    }
    public static void main(String[] args) {
        int arr[] = { 3, 6, 2, 1, 8, 7, 4, 5, 3, 1 };
        selectionsorting(arr);
        System.out.println(Arrays.toString(arr));

    }
}
