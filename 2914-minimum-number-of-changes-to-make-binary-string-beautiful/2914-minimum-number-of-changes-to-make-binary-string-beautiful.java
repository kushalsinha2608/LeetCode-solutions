class Solution {
    public int minChanges(String s) {
    int n=s.length();
    int c=0,i;
    for(i=0;i<n;i+=2)
    {
        char ch1=s.charAt(i);
        char ch2=s.charAt(i+1);
        if(ch1!=ch2)
        {
            c++;
        }
    }   
    return c;
    }
}