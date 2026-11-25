class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
    List<Integer> ans=new ArrayList<>();
    int[] a=new int[nums.length+1];
    for(int i=0;i<nums.length;i++)
    {
        a[nums[i]]++;
    }    
    for(int i=1;i<=nums.length;i++)
    {
        if(a[i]==0)
        {
            ans.add(i);
        }
    }
    return ans;
    }
}