class Solution {
    static int dp[];
    public int helper(int []cost,int n){
        if(n<=1) return 0;

        if(dp[n]!= -1) return dp[n];

        dp[n] = Math.min(helper(cost,n-1) + cost[n-1],helper(cost,n-2)+cost[n-2]);
        return dp[n];
    }

    public int minCostClimbingStairs(int[] cost) {
        dp = new int[cost.length+1];
        for(int i =0;i<=cost.length;i++){
            dp[i]=-1;
        }
        return helper(cost,cost.length);
    }
}
