package hw;

import java.util.Scanner;

public class square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter side : ");
        int side = sc.nextInt();
        float area = Math.powExact(side, 2);
        System.out.print("area of square : " + area);
    }
}
