class Solution {
    public int addDigits(int num) {
    int i,s=0,d;
    if(num>=0&&num<10)
    {
        return num;
    }
    while(num>=10)
    {
        s=0;
        for(i=num;i>0;i/=10)
        {
            d=i%10;
            s+=d;
        }
        num=s;
    }
    return num;
    }
}