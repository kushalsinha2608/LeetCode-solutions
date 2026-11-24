class Solution {
    public String digitSum(String s, int k) {
    int n=s.length();
    int sum=0;
    String x="";
    int i;
    while(n>k)
    {
    for(i=0;i<n;i++)
    {
        sum+=(s.charAt(i)-'0');
        if((i+1)%k==0||i==n-1)
        {
            x+=Integer.toString(sum);
            sum=0;
        }
    }    
    s=x;
    n=s.length();
    x="";
    }
    return s;
    }
}