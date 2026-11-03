class Solution {
    public int firstMissingPositive(int[] nums) {
    int n=nums.length;
    int[] b=new int[n];
    for(int i=0;i<n;i++)
    {
        if(nums[i]>0&&nums[i]<=n)
        {
            b[nums[i]-1]=1;
        }
    }    
    for(int i=0;i<n;i++)
    {
        if(b[i]==0)
        {
            return i+1;
        }
    }
    return n+1;
    }
}