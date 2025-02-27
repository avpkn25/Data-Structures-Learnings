import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int [][] arr = {
            {23, 4, 1},
            {18, 12, 3, 9},
            {78, 99, 34, 56},
            {18, 12}
        };
        int k = 34;
        System.out.println(Arrays.toString(search(arr, k)));
        System.out.println(max(arr));
    }

    public static int[] search(int [][]arr, int k) {
        for(int r=0; r<arr.length; r++) {
            for(int c=0;c<arr[r].length; c++) {
                if(arr[r][c] == k) return new int[] {r, c};
            }
        }
        return new int[] {-1, -1};
    }

    public static int max(int [][]arr) {
        int max = Integer.MIN_VALUE;
        for (int[] row : arr) {
            for (int val : row) {
                if(val > max) max = val;
            }
        }
        return max;
    }
}
