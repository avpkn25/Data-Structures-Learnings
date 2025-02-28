public class BinarySearch {
    public static void main(String[] args) {
        int [] arr = {-18, -12, -7, -4, 2, 3, 4, 15, 16, 18, 22, 34, 45};
        int k = 22;
        System.out.println(binarysearch(arr, k));
    }
    // return the index
    // return -1 if it does not exist
    public static int binarysearch(int []arr, int k) {
        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {
            // find the middle element
            // int mid = (start + end) / 2; -> int having fix size, if we consider big number this formula will not work.
            int mid = start + (end - start) / 2;

            if(k < arr[mid]) end = mid - 1;
            else if (k > arr[mid]) start = mid + 1;
            else return mid;
        }
        return -1;
    } 
}