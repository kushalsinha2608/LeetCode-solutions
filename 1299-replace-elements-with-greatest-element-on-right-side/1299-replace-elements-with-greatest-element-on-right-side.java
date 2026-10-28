class Solution {
    public int[] replaceElements(int[] arr) {
    int n=arr.length;
    int i;int carry=-1;
    for(i=n-1;i>=0;i--)
    {
        int curr=arr[i];
        arr[i]=carry;
        if(curr>carry)
        {
            carry=curr;
        }
    } 
    return arr;   
    }
}