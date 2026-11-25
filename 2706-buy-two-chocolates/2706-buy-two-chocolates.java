class Solution {
    public int buyChoco(int[] prices, int money) {
    int n=prices.length;
    int min=Integer.MAX_VALUE;
    int smin=Integer.MAX_VALUE;
    int mini=-1;
    for(int i=0;i<n;i++)
    {
        if(prices[i]<min)
        {
            min=prices[i];
            mini=i;
        }
    }
    for(int i=0;i<n;i++)
    {
        if(i==mini)
        {
            continue;
        }
        else
        {
            smin=Math.min(smin,prices[i]);
        }
    }
    if(min+smin<=money)
    {
        return money-(min+smin);
    }
    return money;
    }
}