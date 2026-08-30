class Solution {
    static int dp[][];
    public int helper(int[] coins, int amount,int n){
           int INF = 1000000;
         if(amount==0) return 0;
         if (n == 0) return INF;
        
        if(amount >= coins[n-1]){
            if(dp[n][amount] != -1) return dp[n][amount];
            int take = helper(coins,amount - coins[n-1],n)+1;
            int not_take = helper(coins,amount,n-1);
            return dp[n][amount]=Math.min(take,not_take);

        }else{
            return  helper(coins,amount,n-1);
        }

    }

    public int coinChange(int[] coins, int amount) {
        int n = coins.length;
        dp = new int[n+1][amount+1];
        for(int i =0;i<=n;i++){
            for(int j = 0;j<=amount;j++){
                dp[i][j]=-1;
            }
        }
        int ans = helper(coins,amount,coins.length);

        return ans > 10000 ? -1 : ans;
        
    }
}
