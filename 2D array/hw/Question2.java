package hw;

public class Question2 {
    public static void sumOf2ndrows(int matrix[][]) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (i == 1) {
                    sum += matrix[i][j];
                }
            }
        }
        System.out.println("sum of 2nd row in matrix : " + sum);
    }

    public static void main(String[] args) {
        int matrix[][] = {
                { 1, 4, 9 },
                { 11, 4, 3 },
                { 2, 2, 3 }
        };
        sumOf2ndrows(matrix);
    }
}
