class Solution {
    public int pivotIndex(int[] nums) {
    int l=0;
    int n=nums.length;
    int s=0;
    int i;
    for(i=0;i<n;i++)
    {
        s+=nums[i];
    }    
    int r=0;
    for(i=0;i<n;i++)
    {
        r=s-l-nums[i];
        if(r==l)
        {
            return i;
        }
        l+=nums[i];
    }
    return -1;
    }
}