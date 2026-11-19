class Solution {
    public int alternateDigitSum(int n) {
    String s=String.valueOf(n);
    int num=s.length();
    int sum=0;
    if(num%2!=0)
    {
        int k=0;
        for(int i=n;i>0;i/=10)
        {
            int d=i%10;
            if(k%2==0)
            {
                sum+=d;
            }
            else
            {
                sum-=d;
            }
            k++;
        }
    }
    else
    {
        int j=0;
        for(int i=n;i>0;i/=10)
        {
            int f=i%10;
            if(j%2==0)
            {
                sum-=f;
            }
            else
            {
                sum+=f;
            }
            j++;
        }
    }
    return sum;
    }
}