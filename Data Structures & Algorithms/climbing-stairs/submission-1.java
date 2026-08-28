class Solution {
    static int dp[];

     public int helper(int n) {
        if(n== 1 || n==0) return 1;

        if(dp[n]!= -1) return dp[n];

        return dp[n]=helper(n-1) + helper(n-2);
    }
    public int climbStairs(int n) {
        dp = new int[n+1];
      for(int i =0;i<=n;i++){
        dp[i]=-1;
      }
        return helper(n);
    }
}
