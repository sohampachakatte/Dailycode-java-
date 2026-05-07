import java.util.Scanner;

public class linearSearch {
    public static int linSearch(String arr[], String name) {
       
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(name)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String arr[] = {"soham","rohan","sahil","shardul"};
        System.out.println("Enter element want to search : ");
        String key = sc.nextLine();
        int index = linSearch(arr, key);
        if (index == -1) {
            System.out.println("Not found");
        } else {
            System.out.println("Found at : " + index);
        }
    }
}