package Operators.hw;

public class test3 {
    public static void main(String[] args) {
        float x, y, z;
        x = y = z = 2;
        x += y;
        y -= z;
        z /= (x + y);
        System.out.println(x + " " + y + " " + z);
    }
}
