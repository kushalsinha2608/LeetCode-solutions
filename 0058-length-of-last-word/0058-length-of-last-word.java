class Solution {
    public int lengthOfLastWord(String s) {
    int n=s.length();
    int c=0,i,j;
    for(i=n-1;i>=0;i--)
    {
        if(s.charAt(i)!=' ')
        {
            break;
        }
    }    
    for(j=i;j>=0;j--)
    {
        if(s.charAt(j)==' ')
        {
            break;
        }
        c++;
    }
    return c;
    }
}