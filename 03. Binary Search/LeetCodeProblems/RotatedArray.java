// https://leetcode.com/problems/search-in-rotated-sorted-array/description/
public class RotatedArray {
    public static void main(String[] args) {
        int []arr = {3, 4, 5, 6, 7, 0, 1, 2};
        int k = 2;
        System.out.println(answer(arr, k));
    }
    public static int answer(int arr[], int k){
        int pivot = findPivot(arr);
        int ans = binarySearch(arr, 0, pivot, k);
        if(ans != -1) return ans;
        return binarySearch(arr, pivot + 1, arr.length - 1, k);
    }

    // this will not work in duplicate values
    public static int findPivot(int arr[]) {
        int start = 0;
        int end = arr.length - 1;
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(mid < end && arr[mid] > arr[mid + 1]) return mid;
            else if(mid > start && arr[mid] < arr[mid - 1]) return mid-1;
            else if(arr[start] >= arr[mid]) end = mid - 1;
            else start = mid + 1;
        }
        return -1;
    }
    public static int binarySearch(int []arr,int start, int end, int k) {

        while(start <= end) {

            int mid = start + (end - start) / 2;

            if(k < arr[mid]) end = mid - 1;
            else if (k > arr[mid]) start = mid + 1;
            else return mid;
        }
        return -1;
    } 
}
