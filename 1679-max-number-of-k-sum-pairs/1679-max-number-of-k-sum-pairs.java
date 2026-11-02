class Solution {
    public int maxOperations(int[] nums, int k) {
    int n=nums.length;
    Arrays.sort(nums);
    int l=0;
    int r=n-1;
    int c=0;
    while(l<r)
    {
        if(nums[l]+nums[r]==k)
        {
            c++;
            l++;
            r--;
        }
        else if(nums[l]+nums[r]<k)
        {
            l++;
        }
        else
        r--;
    }    
    return c;
    }
}