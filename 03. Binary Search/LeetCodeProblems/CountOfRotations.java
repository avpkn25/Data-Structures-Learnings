public class CountOfRotations {
    public static void main(String[] args) {
        int []arr = {15, 18, 2, 3, 6, 12};
        System.out.println(answer(arr));
    }
    
    public static int answer(int arr[]){
        return findPivot(arr)+1;
    }

    // this will not work in duplicate values
    public static int findPivot(int arr[]) {
        int start = 0;
        int end = arr.length - 1;
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(mid < end && arr[mid] > arr[mid + 1]) return mid;
            else if(mid > start && arr[mid] < arr[mid - 1]) return mid-1;
            // if elements at middle, start, end are equal then just skip the duplicates
            else if (arr[mid] == arr[start] && arr[mid] == arr[end]) {
                // NOTE:- what if these elements at the start and end were the pivots??
                // check if start is pivot
                if(arr[start] > arr[start + 1]) return start;
                start++;
                if(arr[end] < arr[end - 1]) return end-1;
                end--;
            }
            else if(arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) start = mid + 1;
            else end = mid - 1;
        }
        return -1;
    }
}
