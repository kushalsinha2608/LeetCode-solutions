class Solution {
    public int minimizeSum(int[] nums) {
    int n=nums.length;
    Arrays.sort(nums);
    int v1=nums[n-3]-nums[0];   
    int v2=nums[n-2]-nums[1];
    int v3=nums[n-1]-nums[2];       
    return Math.min(v1,Math.min(v2,v3));
    }
}