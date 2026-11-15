class Solution {
    public boolean isValid(String s) {
    int k=-1;
    int n=s.length();
    char[] a=new char[n];
    for(int i=0;i<n;i++)
    {
        if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='[')
        {
            k++;
            a[k]=s.charAt(i);
        }
        else
        {
            if(k==-1)
            {
                return false;
            }
            if(s.charAt(i)==')'&&a[k]!='(')
            return false;
            if(s.charAt(i)=='}'&&a[k]!='{')
            return false;
            if(s.charAt(i)==']'&&a[k]!='[')
            return false;
            k--;
        }
    }
    if(k==-1)
    return true;
    return false;
    }
}