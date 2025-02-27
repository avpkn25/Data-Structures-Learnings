public class LinearSearch {
    public static void main(String []args) {
        int [] nums = {23, 45, 1, 2, 8, 19, -3, 16, -11, 28};
        int k = 1;
        System.out.println(linear3(nums, k));
    } 

    // search in the array: return the index if item found
    // otherwise if item not found return -1
    public static int linear1(int[] arr, int k) {
        if(arr.length == 0) return -1;
        for(int i=0;i<arr.length;i++) {
            if(arr[i] == k) return i;
        }
        return -1;
    }

    // search in the array: return the value if item found
    // otherwise if item not found return minimum value
    public static int linear2(int[] arr, int k) {
        if(arr.length == 0) return -1;
        for(int i:arr) {
            if(i == k) return i;
        }
        return Integer.MIN_VALUE;
    }

    // search in the array: return true if item found
    // otherwise if item not found return false
    public static boolean linear3(int[] arr, int k) {
        if(arr.length == 0) return false;
        for(int i:arr) {
            if(i == k) return true;
        }
        return false;
    }
}
