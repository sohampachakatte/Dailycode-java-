package ConditionalStatement.Hw;

import java.util.Scanner;

public class test4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        String Type = ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) ? "leap year" : "Not a leapYear";
        System.out.println(Type);
    }
}
