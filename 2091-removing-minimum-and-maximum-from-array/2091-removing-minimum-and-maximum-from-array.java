class Solution {
    public int minimumDeletions(int[] nums) {
    int n=nums.length;
    int min=0,max=0;
    int i;
    for(i=1;i<n;i++)
    {
        if(nums[i]<nums[min])
        {
            min=i;
        }
        if(nums[i]>nums[max])
        {
            max=i;
        }
    }    
    int l=Math.min(min,max);
    int r=Math.max(min,max);
    int rf=r+1;
    int lf=n-l;
    int rbs=(l+1)+(n-r);
    return (int)Math.min(rf,(int)Math.min(lf,rbs));
    }
}