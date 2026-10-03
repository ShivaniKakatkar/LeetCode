package Array;

public class MaxWealth {
    public static int richestOne(int[][] nums){
        int answer = 0;
        for (int[] num : nums){
            int sum = 0;
            for (int n : num){
                sum += n;
            }
            if(answer < sum){
                answer = sum;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        int[][] nums = {
                {23,45,67},
                {56,78,90},
                {45,34,12}
        };
        System.out.println(richestOne(nums));
    }
}
