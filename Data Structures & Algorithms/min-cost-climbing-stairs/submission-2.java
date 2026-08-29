class Solution {
    static int dp[];

    public int helper(int[] cost, int n) {
        if (n <= 1) return 0;

        dp[n] = Math.min(
            dp[n - 1] + cost[n - 1],
            dp[n - 2] + cost[n - 2]
        );

        return dp[n];
    }

    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;

        dp = new int[n + 1];

        dp[0] = 0;
        dp[1] = 0;

        for (int i = 2; i <= n; i++) {
            dp[i] = Math.min(
                dp[i - 1] + cost[i - 1],
                dp[i - 2] + cost[i - 2]
            );
        }

        return dp[n];
    }
}