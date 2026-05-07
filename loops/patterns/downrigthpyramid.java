package loops.patterns;

import java.util.Scanner;

public class downrigthpyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row : ");
        int row = sc.nextInt();
        for(int i = row - 1 ; i >=0 ;i--){
            for(int j = 0 ; j < row - i ; j++ ){
                System.out.print(" ");
            }

            for (int k = i; k >=0; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
