class Solution {
    public int maxLength(int[] nums) {
    int max=0;
    int i,j;
    int n=nums.length;
    for(i=0;i<n;i++)
    {
        long p=1;
        long gcd=nums[i];
        long lcm=nums[i];
        for(j=i;j<n;j++)
        {
            p*=nums[j];
            gcd=findGCD(gcd,nums[j]);
            lcm=(lcm*nums[j])/findGCD(lcm,nums[j]);
            if(p==gcd*lcm)
            {
                max=Math.max(max,j-i+1);
            }
        }
    }    
    return max;
    }
    public long findGCD(long a,long b)
    {
        while(b!=0)
        {
            long temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
}