class Solution {

    static String[][] dp;
    static Boolean[][] palindrome;

    public boolean isPalindrome(String s, int start, int end) {

        if (start >= end) {
            return true;
        }

        if (palindrome[start][end] != null) {
            return palindrome[start][end];
        }

        if (s.charAt(start) != s.charAt(end)) {
            return palindrome[start][end] = false;
        }

        return palindrome[start][end] =
            isPalindrome(s, start + 1, end - 1);
    }

    public String helper(String s, int start, int end) {

        if (start == end) {
            return dp[start][end] = s.substring(start, end + 1);
        }

        // Your memoization
        if (dp[start][end] != null) {
            return dp[start][end];
        }

        // Memoized palindrome check
        if (isPalindrome(s, start, end)) {
            return dp[start][end] = s.substring(start, end + 1);
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

        if (n <= 1) {
            return s;
        }

        dp = new String[n][n];
        palindrome = new Boolean[n][n];

        return helper(s, 0, n - 1);
    }
}