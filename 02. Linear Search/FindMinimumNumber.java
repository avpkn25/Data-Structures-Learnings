public class FindMinimumNumber {
    public static void main(String[] args) {
        int [] nums = {23, 45, 1, 2, 8, 19, -3, 16, -11, 28};
        System.out.println(minimum(nums));
    }

    public static int minimum(int []nums) {
        if(nums.length == 0) return -1;
        int min = Integer.MAX_VALUE;
        for(int x : nums) {
            if(x <= min) min = x;
        }
        return min;
    }
}
