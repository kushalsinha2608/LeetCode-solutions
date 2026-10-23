class Solution {
    public int singleNonDuplicate(int[] nums) {
    int n= nums.length;
    int i=1;
    if(n==1)
    {
        return nums[0];
    }
    if(nums[0]!=nums[1])
    {
        return nums[0];
    }
    if(nums[n-1]!=nums[n-2])
    {
        return nums[n-1];
    }
    while(i<n-1)
    {
        if(nums[i]!=nums[i-1]&&nums[i]!=nums[i+1])
        {
            return nums[i];
        }
        i++;
    }
    return -1;    
    }
}