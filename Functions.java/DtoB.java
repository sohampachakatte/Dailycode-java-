import java.util.Scanner;

public class DtoB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Decimal : ");
        int num = sc.nextInt();
        DecitoB(num);
        sc.close();
    }

    public static void DecitoB(int n) {
        int myNum = n;
        int pow = 0;
        int binary = 0;
        while (n > 0) {
            int rem = n % 2;
            binary = binary + (rem * (int) Math.pow(10, pow));
            pow++;
            n = n / 2;
        }
        System.out.println("Binary of " + myNum + " is = " + binary);
        BinatoD(myNum);
    }
    public static void BinatoD(int bnum){
        int myNum = bnum;
        int decimal = 0;
        int i = 0;
        while (bnum > 0) {
            int rem = bnum % 10;
            decimal = decimal + Math.powExact(2, i) * rem;
            bnum = bnum / 10;
            i++;
        }
        System.out.println("Decimal of " + myNum + " is = " + decimal);
    }
}
