package Array;

//Search an element from the array of length = Infinite
//And return the index of the same


public class BSArrayOfInfiniteSize {
    public static int answer(long[] arr, int target) {
        int start = 0;
        int end = 1;
        int newEnd;
        while(target > arr[end]){
            int newStart = end + 1;
            int size = end - start + 1;
            newEnd = end +  size* 2;
            start = newStart;
            if (newEnd > arr.length){
                return -1;
            }
        }
        return binarySearch(arr,target,start,end);
    }
    public static int binarySearch(long[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        long[] nums = {5, 7, 8, 10, 13, 25,
                56, 66, 73, 88, 92, 165, 204, 294, 307};
        int target = 307;

        System.out.println(answer(nums,target));
    }
}

