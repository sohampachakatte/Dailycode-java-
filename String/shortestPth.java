package String;

import java.util.*;

public class shortestPth {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 0, y = 0;
        System.out.print("Enter path : ");
        String path = sc.next();
        for (int i = 0; i < path.length(); i++) {
            char var = path.charAt(i);
            if (var == 'N') {
                y++;
            } else if (var == 'S') {
                y--;
            } else if (var == 'E') {
                x++;
            } else {
                x--;
            }
        }

        int X = x * x;
        int Y = y * y;

        int totalDistance = (int) Math.sqrt(X + Y);
        System.out.println("Total distance : " + totalDistance);

    }
}