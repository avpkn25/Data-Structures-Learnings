
public class OrderAgnostic {
    public static void main(String[] args) {
        // int []arr = {-18, -12, -7, -4, 2, 3, 4, 15, 16, 18, 22, 34, 45};
        int []arr = {99, 77, 65, 43, 22, 12, 8, 5, 1, -3, -6};
        int k = 22;
        System.out.println(search(arr, k));
    }
    public static int search(int []arr, int k) {
        int start = 0;
        int end = arr.length - 1;

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

}
