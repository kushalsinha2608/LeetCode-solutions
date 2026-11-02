class Solution {
    public int thirdMax(int[] nums) {
    int n=nums.length;
    Arrays.sort(nums);
    int c=1;
    int max=nums[n-1];
    for(int i=n-2;i>=0;i--)
    {
        if(nums[i]!=nums[i+1])
        {
            c++;
            if(c==3)
            {
                return nums[i];
            }
        }
    }
    return max;
    }
}