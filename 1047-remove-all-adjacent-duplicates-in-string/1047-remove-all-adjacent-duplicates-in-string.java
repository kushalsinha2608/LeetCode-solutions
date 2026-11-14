class Solution {
    public String removeDuplicates(String s) {
    String a="";
    int n=s.length();
    for(int i=0;i<n;i++)
    {
        int k=a.length();
        if(k>0&&a.charAt(k-1)==s.charAt(i))
        {
            a=a.substring(0,k-1);
        }
        else
        {
            a=a+s.charAt(i);
        }
    }
    return a;
    }
}