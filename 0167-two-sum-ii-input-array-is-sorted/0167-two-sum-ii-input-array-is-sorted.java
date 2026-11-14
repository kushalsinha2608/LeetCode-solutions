class Solution {
    public int[] twoSum(int[] nums, int target) {
    int[] ans=new int[2];
    int n=nums.length;
    int l=0,r=n-1;
    while(l<r)
    {
        int a=nums[l]+nums[r];
        if(a==target)
        {
            ans[0]=l+1;
            ans[1]=r+1;
            return ans;
        }
        else if(a<target)
        {
            l++;
        }
        else
        r--;
    }    
    return ans;
    }
}