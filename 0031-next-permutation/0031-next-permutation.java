class Solution {
    public void nextPermutation(int[] nums) {
    int n=nums.length;
    int i=n-2;
    while(i>=0&&nums[i]>=nums[i+1])
    {
        i--;
    }  
    if(i==-1)
    {
        int l=0;int r=n-1;
    while(l<r)
    {
        int f=nums[l];
        nums[l]=nums[r];
        nums[r]=f;
        l++;
        r--;
    }
    return;
    }  
    int j=n-1;
    while(j>=0&&nums[j]<=nums[i])
    {
        j--;
    }
    int temp=nums[j];
    nums[j]=nums[i];
    nums[i]=temp;
    int l=i+1;int r=n-1;
    while(l<r)
    {
        int f=nums[l];
        nums[l]=nums[r];
        nums[r]=f;
        l++;
        r--;
    }
    }
}