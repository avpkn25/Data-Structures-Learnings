
// https://leetcode.com/problems/find-in-mountain-array/description/
public class FindInMountain {
    public static void main(String[] args) {
        int arr[] = {1, 2, 2, 4, 5, 3, 1};
        int k = 3;
        System.out.println(answer(arr, k));
    }
    public static int find(int arr[]) {
        int start = 0;
        int end = arr.length - 1;
        while(start < end) {
            int mid = start + (end - start) / 2;
            if(arr[mid] > arr[mid+1]) {

                end = mid;
            } else {
                start = mid + 1; 
            }
        }
        
        return start;
    }

    public static int binarysearch(int []arr, int k, int start, int end) {
        
        boolean isAsc = arr[start] < arr[end];

        while(start <= end) {
            int mid = start + (end - start) / 2;

            if(arr[mid] == k) return mid;

            if(isAsc) {
                if(k < arr[mid]) end = mid - 1;
                else start = mid + 1;
            } else {
                if (k < arr[mid]) start = mid + 1;
                else end = mid - 1;
            }
        }
        return -1;
    } 

    public static int answer(int []arr, int k) {
        int peak = find(arr);
        int ans = binarysearch(arr, k, 0, peak );
        if(ans == -1) binarysearch(arr, k, peak+1, arr.length-1);
        return ans;
    }
}
