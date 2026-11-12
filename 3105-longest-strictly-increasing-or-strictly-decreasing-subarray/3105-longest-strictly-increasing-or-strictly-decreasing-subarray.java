class Solution {
    public int longestMonotonicSubarray(int[] nums) {
    int n=nums.length;
    int i,j;int c=1;int max=1;
    for(i=1;i<n;i++)
    {
        if(nums[i]>nums[i-1])
        {
            c++;
        }    
        else
        {
            c=1;
        }
        max=Math.max(max,c);
    }    
    int k=1,max1=1;
    for(j=1;j<n;j++)
    {
        if(nums[j]<nums[j-1])
        {
            k++;
        }
        else
        {
            k=1;
        }
        max1=Math.max(max1,k);
    }    
    return (int)Math.max(max,max1);
    }
}