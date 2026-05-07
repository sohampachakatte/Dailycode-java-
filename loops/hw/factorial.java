package loops.hw;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number  : ");
        int num = sc.nextInt();
        int fact = 1;
        System.out.print("Factorial of " + num + ": ");
        while (num > 0) {
            fact *= num;
            num--;
        }
        System.out.print(fact);

        sc.close();
    }
}
