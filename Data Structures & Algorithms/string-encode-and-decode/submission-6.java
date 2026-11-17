class Solution {

    public String encode(List<String> strs) {
        StringBuilder str = new StringBuilder();

        for (String s : strs) {
            str.append(s.length());
            str.append('#');
            str.append(s);
        }

        return str.toString();
    }

    public List<String> decode(String str) {
        List<String> answer = new ArrayList<>();
        int l = 0;

        while (l < str.length()) {
            int hashIdx = str.indexOf('#', l);
            int n = Integer.parseInt(str.substring(l, hashIdx)); // handles 1-digit and multi-digit lengths
            
            int startIdx = hashIdx + 1;
            int endIdx = startIdx + n;
            
            answer.add(str.substring(startIdx, endIdx));
            l = endIdx; // endIdx is already the start of the next length
        }

        return answer;
    }
}