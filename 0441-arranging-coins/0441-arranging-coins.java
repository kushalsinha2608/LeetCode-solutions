class Solution {
    public int arrangeCoins(int n) {
    long c=0;int i;
    for(i=1;i<=n;i++)
    {
        c+=i;
        if(c>n)
        {
            return i-1;
        }
    }
    return i-1;
    }
}