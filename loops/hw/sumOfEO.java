package loops.hw;

import java.util.Scanner;

public class sumOfEO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        int count = 1;
        int evenSum = 0, oddSum = 0;
        while (count <= n) {
            if (count % 2 == 0) {
                evenSum += count;
            } else {
                oddSum += count;
            }
            count++;
        }
        System.out.println("Sum of even number : " + evenSum);
        System.out.println("Sum of odd Number : " + oddSum);
        sc.close();
    }
}
