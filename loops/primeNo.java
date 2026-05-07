package loops;

import java.util.Scanner;

public class primeNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean isPrime = true;
        if (num <= 1 || num == 2) {
            isPrime = false;
        }
        for (int i = 2; i * i < num; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println("Num is prime");
        } else {
            System.out.println("num is not prime");
        }
    }
}
