package hw;

import java.util.Scanner;

public class ave {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a : ");
        int a = sc.nextInt();
        System.out.print("enter b : ");
        int b = sc.nextInt();
        System.out.print("enter c : ");
        int c = sc.nextInt();
        float average = (a + b + c) / 3;
        System.out.println("average of 3 is : " + average);
    }
}
