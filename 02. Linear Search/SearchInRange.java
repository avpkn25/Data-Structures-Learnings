public class SearchInRange {
    public static void main(String[] args) {
        int [] nums = {23, 45, 1, 2, 8, 19, -3, 16, -11, 28};
        int k = 1;
        int start = 4;
        int end = 1;
        System.out.println(search(nums, k, start, end));
    }

    public static int search(int[] arr, int k, int start, int end) {
        if(arr.length == 0 || start > end) return -1;
        for(int i=start; i<=end; i++) {
            if(arr[i] == k) return i;
        }
        return -1;
    }
}
