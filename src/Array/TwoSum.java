package Array;

import java.util.Arrays;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target){
        int[] ans = new int[2];
        int n1,n2,sum;
        for (int i = 0; i < nums.length; i++) {
            n1 = nums[i];
            for (int j = i+1; j < nums.length; j++) {
                n2 = nums[j];
                sum = n1 + n2;
                if(target == sum){
                    ans[0] = nums[i];
                    ans[1] = nums[j];
                    return ans;
                }
            }
        }

        return new int[0];
    }
    public static void main(String[] args) {
        int[] nums = {2,4,5,6};
        int target = 11;

        int[] result = twoSum(nums, target);
        System.out.println(Arrays.toString(result));
    }
}
