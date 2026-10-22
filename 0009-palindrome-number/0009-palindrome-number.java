class Solution {
    public boolean isPalindrome(int x) {
    int i,k,c=0;
    for(i=x;i>0;i/=10)
    {
        k=i%10;
        c=c*10+k;
    }  
    if(c==x)
    return true;
    else 
    return false;
    }
}