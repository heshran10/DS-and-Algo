//--------- Counting Bits ----------
class Solution9 {
    public int[] countBits(int n) {
        int dp[] = new int[n+1];
        for(int i=1;i<=n;i++){
            dp[i] = dp[i>>1]  + (i&1);
        }
        return dp;
    }
}
// Commit timestamp: 2025-04-21 22:24:00