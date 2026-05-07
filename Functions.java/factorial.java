import java.util.Scanner;

public class factorial {
    public static int factorial(int num) {
        int fact = 1;
        while (num > 0) {
            fact *= num;
            num--;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num : ");
        int num = sc.nextInt();
        int fact = factorial(num);
        System.out.println("Factorial of " + num + " is : " + fact);
    }
}
