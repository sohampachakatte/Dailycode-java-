package ConditionalStatement;

import java.util.Scanner;

public class LargestOf3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A,B,C : ");
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        if (A > B && A > C) {
            System.out.println("A is Greater");
        } else if (B > C) {
            System.out.println("B is Greater");
        } else {
            System.out.println("C is greater");
        }
        sc.close();
    }
}
