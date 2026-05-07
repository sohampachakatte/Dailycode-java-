public class printSubarray {
    public static void printPairs(int numbers[]) {
        int ts = 0;
        int Submax = 0;
        int sum;
        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                sum = 0;
                for (int k = start; k <= end; k++) {
                    System.out.print(numbers[k] + " ");
                    sum += numbers[k];
                }
                if (sum > Submax) {
                    Submax = sum;
                }
                ts++;
                System.out.println();
            }

            System.out.println();
        }
        System.out.println("max sum : " + Submax);
        System.out.println("total sunArrays : " + ts);
    }

    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 10 };
        printPairs(numbers);

    }
}
