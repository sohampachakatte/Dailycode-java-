package ConditionalStatement.Hw;

import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Body temp : ");
        double temp = sc.nextInt();
        if (temp >= 100) {
            System.out.println("You have Fever");
        } else {
            System.out.println("You Dont have fever");
        }
    }
}
