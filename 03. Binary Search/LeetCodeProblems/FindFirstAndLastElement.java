
public class FindFirstAndLastElement {
    public static void main(String[] args) {
        int []arr = {3, 7, 7, 7, 7, 8, 8, 10};
        int k = 1;
        System.out.println(find(arr, k).toString());
    }
    public static int[] find(int arr[], int k) {
        int []ans = {-1, -1};
        ans[0] = search(arr, k, true);
        ans[1] = search(arr, k, false);
        return ans;
    }
    public static int search(int []arr, int k, boolean findStart) {
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;
        while(start <= end) {
            int mid = start + (end - start) / 2;

            if(k <  arr[mid]) end = mid - 1;
            else if(k >  arr[mid]) start = mid + 1;
            else {
                ans = mid;
                if(findStart) end = mid - 1;
                else start = mid + 1;
            }
        }
        return ans;
    }
}
