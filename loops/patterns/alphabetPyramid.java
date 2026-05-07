package loops.patterns;

import java.util.Scanner;

public class alphabetPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = 'A';
        System.out.print("Enter no : ");
        int row = sc.nextInt();

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {

                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
        sc.close();
    }
}
