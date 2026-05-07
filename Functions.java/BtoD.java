import java.util.Scanner;

public class BtoD {
    public static void main(String[] args) {
        // binary to decimal
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Binary no : ");
        int bnum = sc.nextInt();
        int decimal = 0;
        int i = 0;
        while (bnum > 0) {
            int rem = bnum % 10;
            decimal = decimal + Math.powExact(2, i) * rem;
            bnum = bnum / 10;
            i++;
        }
        System.out.println(decimal);
        sc.close();
    }

}
