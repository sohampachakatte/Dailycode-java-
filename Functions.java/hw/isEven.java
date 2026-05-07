import java.util.Scanner;

public class isEven {
    public static boolean checkEven(int num) {
        if (num % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num : ");
        int num = sc.nextInt();

        if (checkEven(num)) {
            System.out.print(num + " is even");
        } else {
            System.out.print(num + " is Odd");
        }
        sc.close();
    }
}
