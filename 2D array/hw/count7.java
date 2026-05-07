package hw;

public class count7 {
    public static int count7inmatrix(int matrix[][], int target) {
        int count = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == target) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int arr[][] = {
            {4,7,8},
            {8,8,7}
        };
        int count = count7inmatrix(arr,7);
        System.out.println("Count of target : " + count);
    }
}