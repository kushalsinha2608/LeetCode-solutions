class Solution {
    public int maxArea(int[] height) {
    int n=height.length;
    int l=0,r=n-1,a=0;
    if(n<2)
    {
        return 0;
    }
    if(n==2)
    {
        return (int)(Math.min(height[l],height[r]))*(r-l);
    }
    while(l<r)
    {
        int ar=(r-l)*(int)Math.min(height[l],height[r]);
        if(ar>a)
        {
            a=ar;
        }    
        if(height[l]<height[r])
        {
            l++;
        }
        else
        {
            r--;
        }
    }
    return a;
    }
}