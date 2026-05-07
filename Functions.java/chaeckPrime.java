import java.util.Scanner;

public class chaeckPrime {
    public static boolean prime(int n) {
        boolean isprime = true;
        if (n <= 1) {
            isprime = false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                isprime = false;
                break;
            }
        }
        return isprime;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num : ");
        int num = sc.nextInt();
        if (prime(num)) {
            System.out.println(num + " is prime");
        } else {
            System.out.println(num + " is not prime");
        }
    }
}
