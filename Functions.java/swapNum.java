class Pair{
    int a = 10;
    int b = 9;
    Pair(int a , int b){
        this.a = a;
        this.b = b;
    }
};
public class swapNum {
    public static void swap(Pair p) {
        int temp = p.a;
        p.a = p.b;
        p.b = temp;
    }
    public static void main(String[] args) {
        Pair p = new Pair(10, 8);

        System.out.println("Before swapping = " + p.a + " " + p.b);
        swap(p);
        System.out.println("After swapping = " + p.a + " " + p.b);
    }
}
