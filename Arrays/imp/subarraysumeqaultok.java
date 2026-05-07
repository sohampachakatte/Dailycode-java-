package imp;
public class subarraysumeqaultok {
    public static void main(String[] args) {
        int arr[] = { 1, 1, 1 ,1};
        int k = 2;
        int sum;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if (sum == k) {
                    count++;
                }
            }
        }
        System.out.println(count); // 3
    }
}
