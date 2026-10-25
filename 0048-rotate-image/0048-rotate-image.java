class Solution {
    public void rotate(int[][] matrix) {
    int n=matrix.length;
    int i,j;
    for(i=0;i<n-1;i++)
    {
        for(j=i+1;j<n;j++)
        {
            int temp=matrix[i][j];
            matrix[i][j]=matrix[j][i];
            matrix[j][i]=temp;
        }
    } 
    for(i=0;i<n;i++)
    {
        int left =0;int right =n-1;
        while(left<right)
        {
            int temp=matrix[i][left];
            matrix[i][left]=matrix[i][right];
            matrix[i][right]=temp;
        
        left++;
        right--;
    } 
    }  
    }
}