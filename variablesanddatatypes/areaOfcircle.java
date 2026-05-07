import java.util.Scanner;
// import java.util.*;
public class areaOfcircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Radius : ");
        int radius = sc.nextInt();
        float area = 3.14f * Math.powExact(radius, 2);
        System.out.println("Area of circle : "+area);
        sc.close();
    }
}
