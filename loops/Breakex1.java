package loops;

import java.util.Scanner;

public class Breakex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter no : ");
            int n = sc.nextInt();
            if (n % 10 == 0) {
                break;
            }
            System.out.println(n);
        } while (true);
        System.out.println("last digit is multiple of 10");
        sc.close();
    }
}
