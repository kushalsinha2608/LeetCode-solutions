class Solution {
    public int[] rearrangeArray(int[] nums) {
    int n=nums.length;
    int i,c=0,k=0;
    for(i=0;i<n;i++)
    {
        if(nums[i]>0)
        {
            c++;
        }
        else
        k++;
    } 
    int[] oddele=new int[k];
    int[] evenele=new int[c];
    int[] ans=new int[n];
    int f=0,g=0;
    for(i=0;i<n;i++)
    {
        if(nums[i]>0)
        {
            evenele[f]=nums[i];
            f++;
        }
        else
        {
            oddele[g]=nums[i];
            g++;
    }   }
    int s=0,d=0;
    for(i=0;i<n;i++)
    {
        if(i%2==0)
        {
            ans[i]=evenele[s];
            s++;
        }
        else
        {
            ans[i]=oddele[d];
            d++;
        }
    }
    return ans;
    }
}