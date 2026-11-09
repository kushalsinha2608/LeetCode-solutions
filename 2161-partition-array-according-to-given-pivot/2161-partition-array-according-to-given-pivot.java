class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
    int n=nums.length;
    int[] ans=new int[n];
    int lp=0,gp=0,ep=0;
    for(int i=0;i<n;i++)
    {
        if(nums[i]<pivot)
        {
            lp++;
        }
        else if(nums[i]==pivot)
        {
            ep++;
        }
        else
        gp++;
    }
    int c=0,d=lp,f=ep+lp;
    for(int i=0;i<n;i++)
    {
            if(nums[i]<pivot)
            {
                ans[c]=nums[i];
                c++;
            }
            else if(nums[i]==pivot)
            {
                ans[d]=nums[i];
                d++;
            }
            else
            {
                ans[f]=nums[i];
                f++;
            }
    }
    return ans;
    }
}