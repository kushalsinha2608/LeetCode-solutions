class Solution {
    public int countElements(int[] nums) {
    int n=nums.length;
    int min=Integer.MAX_VALUE;
    int max=Integer.MIN_VALUE;
    int i,c=0;
    for(i=0;i<n;i++)
    {
        min=(int)Math.min(min,nums[i]);
        max=(int)Math.max(max,nums[i]);
    }    
    for(i=0;i<n;i++)
    {
        if(nums[i]>min&&nums[i]<max)
        {
            c++;
        }
    }
    return c;
    }
}