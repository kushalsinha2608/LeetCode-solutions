class Solution {
    public int removeDuplicates(int[] nums) {
    int n=nums.length;
     int i;int c=0;
     for(i=1;i<n;i++)
     {
         if(nums[i]!=nums[c])
         {
            nums[c+1]=nums[i];
            c++;
         }
     }   
     return c+1;    
    }
}