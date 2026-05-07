import java.util.Scanner;

public class star {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        for(int i = row ; i >= 0 ; i--){
            for (int j = i; j >= 0 ; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}