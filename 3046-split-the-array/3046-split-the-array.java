class Solution {
    public boolean isPossibleToSplit(int[] nums) {
    int n=nums.length;
    if(n%2!=0)
    {
        return false;
    }    
    int[] ans=new int[101];
    for(int num : nums)
    {
        ans[num]++;
        if(ans[num]>2)
        {
            return false;
        }
    }
    return true;
    }
}