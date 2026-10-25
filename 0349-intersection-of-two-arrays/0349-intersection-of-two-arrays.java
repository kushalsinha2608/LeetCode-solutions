class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
    Stack<Integer> st=new Stack<>();
    int n1=nums1.length;
    int n2=nums2.length;   
    int i,j;
    for(i=0;i<n1;i++)
    {
        for(j=0;j<n2;j++)
        {
            if(nums1[i]==nums2[j])
            {
                if(!st.contains(nums1[i]))
                {
                    st.push(nums1[i]);
                }
                break;
            }
        }    
    }
    int[] ans=new int[st.size()];
    for(i=0;i<ans.length;i++)
    {
        ans[i]=st.pop();
    }
    return ans;
    }
}