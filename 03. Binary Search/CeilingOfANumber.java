public class CeilingOfANumber {
    public static void main(String[] args) {
        int []arr = {2, 3, 5, 9, 14, 16, 18};
        int k = 22;
        System.out.println(ceiling(arr, k));
    }
    // smallest number greater than or equal to target
    public static int ceiling(int []arr, int k) {
        int start = 0;
        int end = arr.length - 1;

        if(k > arr[end]) return -1;

        while(start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == k) return k;
            else if(arr[mid] > k) end = mid - 1;
            else start = mid + 1; 
        }
        return arr[start];
    }
}
