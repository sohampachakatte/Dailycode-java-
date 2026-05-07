package hw;

public class Question3 {
    public static void transpose(String matrix[][]) {
        int n = matrix.length, m = matrix[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("[" + matrix[j][i] + "]" + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        String matrix[][] = {
                { "a11", "a12", "a13" },
                { "a21", "a22", "a23" }
        };
        System.out.println("Transpose of matrix : ");
        transpose(matrix);
    }
}
