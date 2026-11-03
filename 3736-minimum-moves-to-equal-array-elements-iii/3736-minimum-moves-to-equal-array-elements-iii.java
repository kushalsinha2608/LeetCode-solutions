class Solution {
    public int minMoves(int[] nums) {
    int max=Integer.MIN_VALUE;
    int n=nums.length;
    int s=0;
    for(int i=0;i<n;i++)
    {
        max=(int)Math.max(max,nums[i]);
        s+=nums[i];
    }   
    return (max*n)-s;
    }
}