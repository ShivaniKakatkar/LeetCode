package Array;

public class BSFindEleInMountainArray {
    public static int search(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        int peak = bitonicPeak(arr,start,end);
        int asc = orderAgnosticBS(arr,target,start,peak);
        if(asc != -1){
            return asc;
        }
        return orderAgnosticBS(arr,target,peak+1,end);
    }
    public static int orderAgnosticBS(int[] arr, int target, int start, int end){
        boolean isAsc = arr[start] < arr[end];
        while(start <= end){
            int mid = start + (end - start)/2;
            if (target == arr[mid]){
                return mid;
            }
            if (isAsc){
                if (target < arr[mid]){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }
            else {
                if (target > arr[mid]){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
    public static int bitonicPeak(int[] arr, int start, int end ){
        while(start < end){
            int mid = start + (end - start)/2;
            if (arr[mid] > arr[mid + 1]){
                end = mid;
            }else {
                start = mid + 1;
            }
        }
        return start;
    }
    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 7, 6, 3, 1};
        int target = 3;
        System.out.println(target+" present at index: "+search(arr, target));
    }
}
