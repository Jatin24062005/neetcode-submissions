class Solution {

    static String[][] dp;

    public boolean isValidPalindrome(String s) {
        String reversed = new StringBuilder(s).reverse().toString();
        return reversed.equals(s);
    }

    public String helper(String s, int start, int end) {

        if (start == end) {
            return dp[start][end]= s.substring(start, end + 1);
        }
        
        if (dp[start][end] != null) {
            return dp[start][end];
        }

        if (isValidPalindrome(s.substring(start, end + 1))) {
            return dp[start][end]= s.substring(start, end + 1);
        }


        String s1 = helper(s, start, end - 1);
        String s2 = helper(s, start + 1, end);

        if (s1.length() >= s2.length()) {
            return dp[start][end] = s1;
        }

        return dp[start][end] = s2;
    }

    public String longestPalindrome(String s) {

        int n = s.length();

        dp = new String[n][n];

        return helper(s, 0, n - 1);
    }
}