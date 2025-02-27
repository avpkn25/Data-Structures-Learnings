//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/

public class NumbersWithEvenNumberOfDigits {
    public static void main(String[] args) {
        int []nums = {12, 345, 2, 6, 7896};
        System.out.println(findNumbers(nums));
    }
    public static int findNumbers(int []nums) {
        int ans = 0;
        for(int x : nums) {
            if(even(x)) ans++;
        }
        return ans;
    }
    // function to check whether a number contains even number of digits or not
    public static boolean even(int x) {
        int count = 0;
        while(x > 0) {
            count++;
            x /= 10;
        }
        return count % 2 == 0;
    }

    // shortcut to find the number of digits
    static int digits(int num) {
        return (int)(Math.log10(num)) + 1;
    }
}
