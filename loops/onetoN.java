package loops;

import java.util.Scanner;

public class onetoN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Upto : ");
        int n = sc.nextInt();
        int counter = 1;
        while (counter <= n) {
            System.out.print(counter++ + " ");
        }
        sc.close();
    }
}
