import java.util.Scanner;

public class keyinMatrix {

    public static boolean search(int matrix[][], int key, int n, int m) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == key) {
                    System.out.println("found at cell : " + i + " , " + j);
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int matrix[][] = new int[3][3];
        Scanner sc = new Scanner(System.in);
        // row col
        int n = matrix.length, m = matrix[0].length;
        System.out.print("Enter matrix element : ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("2d matrix : ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("enter key to find : ");
        int key = sc.nextInt();
        search(matrix, key, n, m);
    }
}