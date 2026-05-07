import java.util.Scanner;

public class arrayCC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks[] = new int[5];

        System.out.println("Array Input : ");
        for (int i = 0; i < marks.length; i++) {
            marks[i] = sc.nextInt();
        }

        System.out.println("Array output : ");
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " ");
        }
        System.out.println();
        System.out.println("array length : " + marks.length);
        sc.close();
    }
}