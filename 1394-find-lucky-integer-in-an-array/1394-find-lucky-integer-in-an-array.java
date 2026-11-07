class Solution {
    public int findLucky(int[] nums) {
    int n=nums.length;
    int i,j,max=-1;
    for(i=0;i<n;i++)
    {   int s=0;
        for(j=0;j<n;j++)
        {
            if(nums[i]==nums[j])
            {
                s++;
            }
        }
        if(s>max&&s==nums[i])
        {
           max=s;
        }
    } 
    return max;   
    }
}