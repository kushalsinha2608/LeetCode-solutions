class Solution {
    public boolean isValid(String s) {
    int k=-1;
    int n=s.length();
    Stack<Character> st=new Stack<>();
    for(int i=0;i<n;i++)
    {
        if(s.charAt(i)=='(' || s.charAt(i)=='[' || s.charAt(i)=='{')
        {
            st.push(s.charAt(i));
        }
        else
        {
            if(st.isEmpty())
            {
                return false;
            }
            char c=s.charAt(i);
            char ch=st.peek();
            if(c==')'&&ch=='(' || c==']'&&ch=='[' || c=='}'&&ch=='{')
            {
                st.pop();
            }
            else
            {
                return false;
            }
        }
    }
    if(st.isEmpty())
    {
        return true;
    }
    return false;
    }
}