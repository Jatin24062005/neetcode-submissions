class Solution {
    static int dp[];

    public int helper(String s, int n) {

        if (n == 0) {
            return 1;
        }

        if (n == 1) {
            return 1;
        }

        if (dp[n] != -1) {
            return dp[n];
        }

        // If last digit is 0,
        // it cannot be decoded alone.
        if (s.charAt(n - 1) == '0') {

            int num = Integer.parseInt(s.substring(n - 2, n));

            // Only 10 and 20 are valid
            if (num == 10 || num == 20) {
                return dp[n] = helper(s, n - 2);
            }

            return dp[n] = 0;
        }

        // Take one digit
        int left = helper(s, n - 1);

        // Take two digits
        int num = Integer.parseInt(s.substring(n - 2, n));

        int right = 0;

        if (num >= 10 && num <= 26) {
            right = helper(s, n - 2);
        }

        return dp[n] = left + right;
    }

    public int numDecodings(String s) {

        if (s.charAt(0) == '0') {
            return 0;
        }

        int n = s.length();

        dp = new int[n + 1];

        for (int i = 0; i <= n; i++) {
            dp[i] = -1;
        }

        return helper(s, n);
    }
}