class Solution {
    public List<Integer> majorityElement(int[] nums) {
    List<Integer> ans=new ArrayList<>();
    Arrays.sort(nums);
    int d=nums.length;
    int n=d/3;
    for(int i=0;i<d;i++)
    {
        if(i>0&&nums[i]==nums[i-1])
        {
            continue;
        }
        int c=1;
        for(int j=i+1;j<d;j++)
        {
            if(nums[i]==nums[j])
            {
                c++;
            }
        }
        if(c>n)
        {
            ans.add(nums[i]);
        }
    }
    return ans;
    }
}