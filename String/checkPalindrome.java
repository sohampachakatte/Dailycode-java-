package String;

import java.util.Scanner;

public class checkPalindrome {
    public static boolean check(String name) {
        int left = 0;
        int right = name.length() - 1;
        while (left <= right) {
            if (name.charAt(left) != name.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : ");
        String name = sc.next();
        if (check(name)) {
            System.out.println(name + " is palindrome");
        } else {
            System.out.println(name + " is not palindrome");
        }
    }
}
