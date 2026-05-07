import java.util.Scanner;

public class checkPalindrome {
    public static boolean palindrome(int num) {
        int temp = num;
        int revNum = 0;
        while (num > 0) {
            int rem = num % 10;
            revNum = revNum * 10 + rem;
            num /= 10;
        }
        if (temp == revNum) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num : ");
        int num = sc.nextInt();
        if (palindrome(num)) {
            System.out.println(num + " is palindrome");
        } else {
            System.out.println(num + " is not palindrome");
        }

        sc.close();
    }
}
