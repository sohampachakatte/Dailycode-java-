import java.util.Scanner;

public class FunctionOvrloading {
    public static void multiply(int a, int b) {
        System.out.println("Under : public static void multiply(int a , int b) ");
        int multiply = a * b;
        System.out.println("multiply : " + multiply);

    }

    public static void multiply(float a, float b) {
        System.out.println("Under : public static void multiply(float a , flaot b) ");
        float multiply = a * b;
        System.out.println("multiply : " + multiply);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a and b : ");
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        multiply(a, b);
        sc.close();
    }
}
