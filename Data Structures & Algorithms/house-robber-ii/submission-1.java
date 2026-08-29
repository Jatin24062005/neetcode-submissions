class Solution {
    static int dp[];
   public int  helper(int[] nums,int strt,int n){
   if(n-strt==0) return 0;
  if(n-strt==1) return nums[strt];

    if(dp[n]!= -1) return dp[n];  
    return dp[n]= Math.max(helper(nums,strt,n-1),helper(nums,strt,n-2)+nums[n-1]);
    }
    public int rob(int[] nums) {
           int n = nums.length; 
         
           if(n < 2) return nums[0];
        
        dp = new int[n + 1]; 
        
        for(int i = 0; i <= n; i++) { 
            dp[i] = -1; 
        } 

        int first = helper(nums, 0, n - 1);

        // Reset dp before solving the second range
        for(int i = 0; i <= n; i++) { 
            dp[i] = -1; 
        }

        int second = helper(nums, 1, n);

        return Math.max(first, second); 
    }
}
