class Solution {
    public int longestConsecutive(int[] nums) {
    Arrays.sort(nums);
    int l=0,r=1,c=1,max=1;
    int n=nums.length;
    if(n==0)
    {
        return 0;
    }
    for(int i=1;i<n;i++)
    {
        if(nums[i]==nums[i-1])
        {
            continue;
        }
        if(nums[i]==nums[i-1]+1)
        {
            c++;
        }
        else
        {
            c=1;
        }
        max=(int)Math.max(max,c);
    }    
    return max;
    }
}