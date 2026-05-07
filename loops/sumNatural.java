package loops;
import java.util.Scanner;
public class sumNatural {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter No : ");
        int num = sc.nextInt();
        
        System.out.print("Sum of " + num + " natural no is : ");

        int count = 1;
        int sum = 0;

        while (count <= num) {
            sum += count;
            count++;
        }
        System.out.print(sum);
    }
}
