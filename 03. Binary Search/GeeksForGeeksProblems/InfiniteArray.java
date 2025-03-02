package GeeksForGeeksProblems;

public class InfiniteArray {
    public static void main(String[] args) {
        int []arr = {2, 3, 4, 6, 8, 10, 13, 15, 17, 19};
        int k = 4;
        System.out.println(answer(arr, k));
    }
    public static int answer(int arr[], int k) {
        // start with the box of size 2
        int start = 0;
        int end = 1;
        // condition for the target to lie in the range
        while ( k > arr[end]) {
            int newStart = end + 1;
            // double the box value
            // end = previous end + sizeofbox * 2;
            end = end + (end - start + 1) * 2;
            start = newStart;
        }
        return binarysearch(arr, k, start, end);
    }
    public static int binarysearch(int []arr, int k, int start, int end) {

        while(start <= end) {

            int mid = start + (end - start) / 2;

            if(k < arr[mid]) end = mid - 1;
            else if (k > arr[mid]) start = mid + 1;
            else return mid;
        }
        return -1;
    } 
}
