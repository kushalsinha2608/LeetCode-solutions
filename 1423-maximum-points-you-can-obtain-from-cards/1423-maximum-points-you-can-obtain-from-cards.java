class Solution {
    public int maxScore(int[] cardScore, int k) {
        int n = cardScore.length;
        int total = 0;
        for(int i = 0; i < n; i++) 
        {
            total += cardScore[i];
        }
        int window = 0;
        for(int i = 0; i < n-k; i++) 
        {
            window += cardScore[i];
        }
        int min = window;
        for(int i = n-k; i < n; i++) 
        {
            window += cardScore[i] - cardScore[i-(n-k)];
            min = Math.min(min, window);
        }
        return total - min;
    }
}