class Solution {
    public int mirrorDistance(int n) {
    int s=0,temp,i;
    for(i=n;i>0;i/=10)
    {
        temp=i%10;
        s=s*10+temp;
    }    
    return Math.abs(s-n);
    }
}