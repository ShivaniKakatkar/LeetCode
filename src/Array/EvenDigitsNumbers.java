package Array;

public class EvenDigitsNumbers {
    public static int findNumbers(int[] nums){
        int count = 0;
        for(int num : nums){
            if(even(num)){
                count++;
            }
        }
        return count;
    }
    public static boolean even(int num){
//        int digits = digits(num);
//        if(digits % 2 == 0){
//            return true;
//        }
        return digits(num) % 2 == 0;
    }
    public static int digits2(int num){
        if(num<0){
            num = num * -1;
        }
        return (int)(Math.log10(num) + 1);
    }
    public static int digits(int num){
        if(num == 0){
            return 1;
        }
        if (num < 0){
            num = num * -1;
        }
        int count = 0;
        while(num > 0){
            count++;
            num = num / 10;
        }
        return count;
    }
    public static void main(String[] args) {
        int[] nums = {12,3451,-5345,72,8978};
        System.out.println("Number of array elements with even digit in each element: "+findNumbers(nums));
        System.out.println("Is the number contains even number of digits: "+even(3445));
        System.out.println("Digit count in a number: "+digits2(-34566));
    }
}

