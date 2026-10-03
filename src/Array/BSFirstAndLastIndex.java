package Array;

//Find Range of a target element form an array of integers,
//if the element does not found return [-1, -1]
//Ex: A=[3, 6, 6, 6, 6, 6, 7, 8, 8, 9], target= 6
//return : [1, 5]

import java.util.Arrays;

public class BSFirstAndLastIndex {
    public static int[] findIndex(int[] nums, int target){
        int[] ans = {-1, -1};
//        int start = search(nums,target,true);
//        int end = search(nums,target,false);
//        ans[0] = start;
//        ans[1] = end;
        ans[0] = search(nums,target,true);
        if (ans[0] != -1){
            ans[1] = search(nums,target,false);
        }
        return ans;
    }
    public static int search(int[] nums, int target,boolean findFirstNum){
        int ans = -1;
        int start = 0;
        int end = nums.length -1;
        while (start <= end) {
//            int mid = (start + end) / 2;//for Small Integers
            int mid = start + (end - start) / 2;

            if (target == nums[mid]) {
                ans = mid;
                if (findFirstNum){
                    end = mid -1;
                }else{
                    start = mid + 1;
                }
            } else if (target < nums[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 7, 7, 8, 8, 10};
        int target = 7;
        int[] result = findIndex(nums,target);
        System.out.println(Arrays.toString(result));

    }
}
