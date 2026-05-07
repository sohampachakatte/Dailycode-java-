package loops.patterns;

import java.util.Scanner;

public class leftNumpattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no : ");
        int row = sc.nextInt();

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                char ch = 'A';
                System.out.print((char)(ch + j - 1));
            }