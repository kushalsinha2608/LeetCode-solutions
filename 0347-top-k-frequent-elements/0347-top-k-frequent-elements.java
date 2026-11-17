class Solution {
    public int[] topKFrequent(int[] nums, int k) {
    int n=nums.length;
    HashMap<Integer,Integer> hm=new HashMap<>();
    for(int i=0;i<n;i++)
    {
        hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
    }
    List<Integer>[] buckets=new ArrayList[n+1];
    for(int i: hm.keySet())
    {
        int f=hm.get(i);
        if(buckets[f]==null)
        {
            buckets[f]=new ArrayList<>();
        }
        buckets[f].add(i);
    }
    int[] res=new int[k];
    int j=0;
    for(int i=n;i>=1;i--)
    {
        if(buckets[i]!=null)
        {
            for(int num:buckets[i])
            {
                res[j++]=num;
                if(j==k)
                {
                    return res;
                }
            }
        }
    }
    return res;
    }
}