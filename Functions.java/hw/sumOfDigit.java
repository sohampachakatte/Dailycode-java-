import java.util.Scanner;

public class sumOfDigit {
    public static void sumofDigit(int digit) {
        int sum = 0;
        while (digit > 0) {
            int rem = digit % 10;
            sum = sum + rem;
            digit = digit / 10;
        }
        System.out.println("Sum of digit : " + sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter digit : ");
        int digit = sc.nextInt();
        sumofDigit(digit);
        sc.close();
    }
}