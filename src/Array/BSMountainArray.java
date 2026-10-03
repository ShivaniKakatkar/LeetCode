package Array;

//Find the peak of mountain array or Bitonic Array
//Ex: A=[2, 4, 5, 7, 6, 3, 1]
//return 3 (index of 7)

public class BSMountainArray {
    public static int bitonicPeak(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while (start < end){
            int mid = start + (end - start) / 2;
            if(arr[mid] > arr[mid + 1]){
//                if mid = 5 (at 3) then it checks => arr[5] > arr[5 + 1]
//                3 > 1 => end = 5
                end = mid;
            }else{
//                if mid = 2 (at 5) then it checks => arr[2] > arr[2 + 1]
//                5 > 7 X => mid is skipped and next element is used as start =>start = 3
                start = mid + 1;
            }
        }
        return start;// or return end;
    }
    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 7, 6, 3, 1};
        System.out.println("index of peak:"+bitonicPeak(arr));
    }
}

