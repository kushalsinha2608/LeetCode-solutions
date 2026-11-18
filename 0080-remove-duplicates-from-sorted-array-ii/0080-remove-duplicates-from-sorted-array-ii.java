class Solution {
    public int removeDuplicates(int[] nums) {
    int n=nums.length;
    int k=0,i;
    for(i=0;i<n;i++)
    {
        if(k<2 || nums[i]!=nums[k-2])
        {
            nums[k]=nums[i];
            k+=1;
        }
    }    
    return k;
    }
}