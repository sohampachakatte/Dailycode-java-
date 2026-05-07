package hw;

import java.util.HashSet;

public class dublicate2 {
    public static boolean atLeastTwice(int nums[]){
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0 ; i < nums.length ; i++){
            if(set.contains(nums[i])){
                return true;
            }else{
                set.add(nums[i]);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 1 };
        if (atLeastTwice(nums)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
    }
}
