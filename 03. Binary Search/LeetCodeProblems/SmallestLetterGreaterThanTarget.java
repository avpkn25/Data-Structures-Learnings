package LeetCodeProblems;

// https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/
public class SmallestLetterGreaterThanTarget {
    public static void main(String[] args) {
        char []arr = {'c','f','j'};
        char k = 'a';
        System.out.println(ceiling(arr, k));
    }
    // smallest number greater than or equal to target
    public static char ceiling(char []arr, char k) {
        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {
            int mid = start + (end - start) / 2;

            if(arr[mid] > k) end = mid - 1;
            else start = mid + 1; 
        }
        return arr[start % arr.length];
    }
}
