class Solution {
    static int dp[];
    public int helper(int []nums,int n){
        if(n==0) return 0;
        if(n==1) return nums[n-1];
        if(dp[n]!= -1){
            return dp[n];
        }

        return dp[n]=Math.max(helper(nums,n-1),helper(nums,n-2)+nums[n-1]);
    }
    public int rob(int[] nums) {
        int n = nums.length;
        dp=new int[n+1];
        for(int i =0;i<=n;i++){
            dp[i]=-1;

        }

        return helper(nums,n);
    }
}
