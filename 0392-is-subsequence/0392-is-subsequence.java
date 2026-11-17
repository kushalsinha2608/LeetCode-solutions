class Solution {
    public boolean isSubsequence(String s, String t) {
    int c=0;int i,j=0;
    for(i=0;i<s.length();i++)
    {
        while(j<t.length())
        {
            if(s.charAt(i)==t.charAt(j))
            {
                c++;
                j++;
                break;
            }
            j++;
        }
    }    
    if(c==s.length())
    {
        return true;
    }
    return false;
    }
}