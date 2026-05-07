package hw;

import java.util.Scanner;

public class cost {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Pencil : ");
        int pencil = sc.nextInt();
        System.out.println("Enter pen : ");
        int pen = sc.nextInt();
        System.out.println("Enter eraser : ");
        int eraser = sc.nextInt();
        double TotalCost = (pencil + pen + eraser) + (pencil + pen + eraser) * 0.18;
        System.out.println("Total cost of eraser : " + TotalCost);
    
    }
}
