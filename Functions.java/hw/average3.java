import java.util.Scanner;

public class average3 {

    public static void calAverage(int x, int y, int z) {
        double average = (x + y + z) / 3;
        System.out.print("Average : " + average);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 3 No : ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        calAverage(x, y, z);
        sc.close();
    }
}