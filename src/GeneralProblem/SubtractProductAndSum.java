package GeneralProblem;

public class SubtractProductAndSum {
    public static int subtractProductAndSum(int n) {
        int product = 1;
        int sum = 0;
        int digit;
        while(n != 0){
            digit = n % 10;
            product *= digit;
            sum += digit;
            n /= 10;
        }
        return product - sum;
    }
    public static void main(String[] args) {
        System.out.println(subtractProductAndSum(234));
    }
}
