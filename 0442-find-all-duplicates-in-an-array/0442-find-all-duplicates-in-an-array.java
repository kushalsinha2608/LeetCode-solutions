class Solution {
    public List<Integer> findDuplicates(int[] nums) {
    int n=nums.length;
    List<Integer> ans = new ArrayList<>();
    int l=0,r=1;
    Arrays.sort(nums);
    while(r<n)
    {
        if(nums[l]==nums[r])
        {
            ans.add(nums[l]);
            l+=2;
            r+=2;
        }
        else
        {
            l++;
            r++;
        }
    }
    return ans;    
    }
}