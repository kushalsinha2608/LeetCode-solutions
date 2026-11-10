class Solution {
    public int sumOfUnique(int[] nums) {
    int[] ans=new int[101];
    for(int num:nums)
    {
        ans[num]++;
    }    
    int s=0;
    for(int i=1;i<=100;i++)
    {
        if(ans[i]==1)
        {
            s+=i;
        }
    }
    return s;
    }
}