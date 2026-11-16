class Solution {
    public boolean canJump(int[] nums) {
    int n=nums.length;
    if(n==1&&nums[0]==1)
    {
        return true;
    }
    int mr=0;
    for(int i=0;i<n;i++)
    {
        if(i>mr)
        {
            return false;
        }
        mr=Math.max(mr,i+nums[i]);
        if(mr>=n-1)
        {
            return true;
        }
    }    
    return false;
    }
}