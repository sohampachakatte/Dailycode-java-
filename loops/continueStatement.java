package loops;

public class continueStatement {
    public static void main(String[] args) {
        int count = 1;
        do {

            if (count % 2 == 0) {
                count++;
                continue;
            }
            System.out.println(count++);

        } while (count <= 10);
    }
}
