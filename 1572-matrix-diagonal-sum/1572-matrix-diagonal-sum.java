class Solution {
    public int diagonalSum(int[][] mat) {
    int n=mat.length;
    int m=mat[0].length;
    int s=0;
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<n;j++)
        {
            if(i==j || i+j==n-1)
            {
                s+=mat[i][j];
            }
        }
    }    
    return s;
    }
}