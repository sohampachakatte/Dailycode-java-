package String;

public class LargestString {
    public static void main(String[] args) {
        String fruits[] = { "apple", "banana", "mango" };

        String large = fruits[0];
        for (int i = 1; i < fruits.length; i++) {
            if (large.compareTo(fruits[i]) < 0) {
                large = fruits[i];
            }
        }
        System.out.println("Large String : " + large);
    }
}
