class Solution {
    public long countCommas(long n) {
    if(n<1000)
    {
        return 0;
    }    
    long ans=0;
    for(long x=1000;x<=n;x*=1000)
    {
        ans+=n-x+1;
    }
    return ans;
    }
}