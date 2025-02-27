//https://leetcode.com/problems/richest-customer-wealth/description/

public class MaxWealth {
    public static void main(String[] args) {
        int [][]accounts = {
            {1, 2, 3},
            {3, 2, 1}
        };
        System.out.println(maximumWealth(accounts));
    }

    public static int maximumWealth(int [][] accounts) {
        int maxwealth = Integer.MIN_VALUE;
        for(int []person : accounts) {
            int wealth = 0;
            for(int account : person) {
                wealth += account;
            }
            if(wealth > maxwealth) maxwealth = wealth;
        }
        return maxwealth;
    }
}
