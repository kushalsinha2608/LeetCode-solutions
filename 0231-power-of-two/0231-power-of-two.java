class Solution {
    public boolean isPowerOfTwo(int n) {
    if(n==1)
    {
        return true;
    }
    for(int i=0;i<=(int)Math.ceil(Math.sqrt(n));i++)
    {
        if(Math.pow(2,i)==n)
        {
            return true;
        }
    }    
    return false;
    }
}