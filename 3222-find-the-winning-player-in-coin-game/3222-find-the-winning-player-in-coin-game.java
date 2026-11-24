class Solution {
    public String winningPlayer(int x, int y) {
    int moves=Math.min(x,y/4);
    if(moves%2==0)
    {
        return "Bob";
    }
    return "Alice";
    }
}