class Solution {
    public int buyChoco(int[] prices, int money) {
    int n=prices.length;
    Arrays.sort(prices);
    if(n<2)
    {
        return 0;
    }
    if(prices[0]+prices[1]<=money)
    {
        return money-(prices[0]+prices[1]);
    }
    return money;
    }
}