package ConditionalStatement;

import java.util.Scanner;

public class PassOrFail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();
        String reportCard = marks>=33 ?"pass" :"fail";
        System.out.println(reportCard);
    }
}
