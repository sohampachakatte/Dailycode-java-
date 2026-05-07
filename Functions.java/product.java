public class product {
    public static int multiply(int a ,int b){
        int product = a * b;
        return product;
    }
    public static void main(String[] args) {
        int a = 10,b = 9;
        int pro = multiply(a,b);
        System.out.println("product of a ,b is: " + pro);
    }
}
