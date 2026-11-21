class Solution {
    public int rob(int[] money) {
        int n = money.length;
        if(n == 1)
        {
            return money[0];
        }
        return Math.max(solve(money, 0, n-2),solve(money, 1, n-1));
    }
    public int solve(int[] money, int start, int end) 
    {
        int prev2 = 0;
        int prev1 = 0;
        for(int i = start; i <= end; i++) 
        {
            int curr = Math.max(prev1, prev2 + money[i]);
            prev2 = prev1;
            prev1 = curr;
        }
        return prev1;
    }
}