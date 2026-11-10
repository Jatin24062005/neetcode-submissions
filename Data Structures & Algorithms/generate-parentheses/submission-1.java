

class Solution {
    public List<String> generateParenthesis(int n) {
        int open = 0;
        int close = 0;
        StringBuilder str = new StringBuilder();
        List<String> list = new ArrayList<>();
        Helper(str, open, close, n, list);
        return list;
    }

    public void Helper(StringBuilder str, int open, int close, int n, List<String> list) {
        if (open > n || close > open) {
            return;
        }
        if (open == n && close == n) {
            list.add(str.toString());
            return;
        }

        if (open < n) {
            str.append('(');
            Helper(str, open + 1, close, n, list);
            str.deleteCharAt(str.length() - 1); // backtrack
        }
        if (close < open) {
            str.append(')');
            Helper(str, open, close + 1, n, list);
            str.deleteCharAt(str.length() - 1); // backtrack
        }
    }
}
