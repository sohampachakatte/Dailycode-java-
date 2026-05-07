package ConditionalStatement;

import java.util.Scanner;

public class ternayOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String type = ((num % 2) == 0) ? "even" : "odd";
        System.out.println(type);
        sc.close();
    }
}