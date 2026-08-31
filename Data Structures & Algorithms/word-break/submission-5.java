class Solution {

    static Boolean[] dp;

    public boolean helper(String s, HashSet<String> set, int strt) {

        if (strt == s.length()) {
            return true;
        }

        if (dp[strt] != null) {
            return dp[strt];
        }

        for (int end = strt + 1; end <= s.length(); end++) {

            String sub = s.substring(strt, end);

            if (set.contains(sub)) {

                if (helper(s, set, end)) {
                    return dp[strt] = true;
                }
            }
        }

        return dp[strt] = false;
    }

    public boolean wordBreak(String s, List<String> wordDict) {

        HashSet<String> set = new HashSet<>(wordDict);

        dp = new Boolean[s.length()];

        return helper(s, set, 0);
    }
}