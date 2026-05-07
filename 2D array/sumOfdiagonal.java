import java.util.Scanner;

public class sumOfdiagonal {
    public static void main(String[] args) {
        int matrix[][] = new int[3][3];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter matrix element : ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Matrix : ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.print("Sum of diagonal elements : ");
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i];
            if (i != matrix.length - 1 - i)
                sum += matrix[i][matrix.length - 1 - i];
        }
        // brute force
        // for(int i = 0 ; i < 4 ; i++){
        // for(int j = 0 ; j < 4 ; j++){
        // if(i == j){
        // sum += matrix[i][j];
        // }else if(i + j == matrix.length - 1) sum +=matrix[i][j];
        // }
        // }
        System.out.print(sum);
    }
}
