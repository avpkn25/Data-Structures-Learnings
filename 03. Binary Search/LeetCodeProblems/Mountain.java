
public class Mountain {
    public static void main(String[] args) {
        int arr[] = {0, 1, 0};
        System.out.println(find(arr));
    }
    public static int find(int arr[]) {
        int start = 0;
        int end = arr.length - 1;
        while(start < end) {
            int mid = start + (end - start) / 2;
            if(arr[mid] > arr[mid+1]) {
                // you are in decreasing part of array
                // this may be the answer, but look at left
                // this is why end != mid - 1
                end = mid;
            } else {
                // you are in the ascending part of the array
                start = mid + 1; // because we know that mid+1 element > mid element
            }
        }
        // in the end, start == end and pointing to the largest number because of 2 checks
        // start and end are always trying to find max element in the above 2 checks
        // hence, when they are pointing to just one element, this is the max one because that is what the checks say
        // more elaboration: at every point of time start and end, they have the best possible answer till that time
        // and if we are saying that only one item is remaining, hence because of above line that is the best possible answer
        return start;// or return end, both are equal
    }
}
