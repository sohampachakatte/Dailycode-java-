package imp;
public class maxSubarrayII {
    public static void maxSub(int numbers[]){
        int prefix[] = new int[numbers.length];
        prefix[0] = numbers[0];
        for(int i = 1 ; i < numbers.length ; i++){
            prefix[i] = prefix[i-1] + numbers[i];
        }
        int maxSum = Integer.MIN_VALUE;
        int currentSum;
        for(int i = 0 ; i< numbers.length ; i++){
            int start = i;
            for(int j = i ; j < numbers.length ; j++){
                int end = j;
                currentSum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1] ;
                if(maxSum < currentSum){
                    maxSum = currentSum;
                }
            }
        }
        System.out.println("Maxsum = " + maxSum);
    }
    public static void main(String[] args) {
        int  numbers[] = {1,-2,6,-1,3};
        maxSub(numbers);
    }
}
