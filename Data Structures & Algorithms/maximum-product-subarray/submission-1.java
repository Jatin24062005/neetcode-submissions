class Solution {

    int[][] dp;

    public int[] helper(int[] nums, int n) {

        if (n == 1) {
            return new int[]{nums[0], nums[0]};
        }

        // Already calculated
        if (dp[n][0] != Integer.MIN_VALUE) {
            return new int[]{dp[n][0], dp[n][1]};
        }

        int[] prev = helper(nums, n - 1);

        int prevMax = prev[0];
        int prevMin = prev[1];

        int curr = nums[n - 1];

        int takeMax = curr * prevMax;
        int takeMin = curr * prevMin;

        int max = Math.max(curr, Math.max(takeMax, takeMin));
        int min = Math.min(curr, Math.min(takeMax, takeMin));

        dp[n][0] = max;
        dp[n][1] = min;

        return new int[]{max, min};
    }

    public int maxProduct(int[] nums) {

        dp = new int[nums.length + 1][2];

        for (int i = 0; i <= nums.length; i++) {
            dp[i][0] = Integer.MIN_VALUE;
            dp[i][1] = Integer.MAX_VALUE;
        }

        int ans = Integer.MIN_VALUE;

        for (int i = 1; i <= nums.length; i++) {

            int[] result = helper(nums, i);

            ans = Math.max(ans, result[0]);
        }

        return ans;
    }
}