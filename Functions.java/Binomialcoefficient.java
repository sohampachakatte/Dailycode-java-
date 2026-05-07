import java.util.Scanner;

public class Binomialcoefficient {
    public static int factorial(int num) {
        int fact = 1;
        while (num > 0) {
            fact *= num;
            num--;
        }
        return fact;
    }

    public static int result(int n, int r) {
        int nfact = factorial(n);
        int rfact = factorial(r);
        int nrfact = factorial(n - r);
        int finalres = (nfact) / (rfact * nrfact);
        return finalres;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        System.out.print("Enter r : ");
        int r = sc.nextInt();
        int finalres = result(n, r);
        System.out.println("Binomial coefficient of " + n + " and " + r + "is : " + finalres);

    }
}
