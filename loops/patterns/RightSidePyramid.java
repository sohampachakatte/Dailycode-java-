package loops.patterns;

import java.util.Scanner;

public class RightSidePyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Row : ");
        int row = sc.nextInt();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row - i ; j++) {
                System.out.print(" ");
            }
            for (int k = row; k >= row - i ; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
