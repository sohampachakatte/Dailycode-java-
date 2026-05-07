package ConditionalStatement;

import java.util.Scanner;

public class switvhStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        switch (num) {
            case 1:
                System.out.println("mangoes");
                break;
            case 2:
                System.out.println("orange");
                break;
            case 3:
                System.out.println("gawa");
                break;
            case 4:
                System.out.println("stawberry");
                break;
            default:
                System.out.println("ARE YOU DREAMING");
                break;

        }
    }
}
