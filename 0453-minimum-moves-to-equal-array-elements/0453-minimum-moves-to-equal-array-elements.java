class Solution {
    public int minMoves(int[] nums) {
    int n=nums.length;
    int d=Integer.MAX_VALUE;
    int s=0;
    for(int i=0;i<n;i++)
    {
        d=Math.min(d,nums[i]);
        s+=nums[i];
    }    
    return (int)(s-(long)n*d);
    }
}