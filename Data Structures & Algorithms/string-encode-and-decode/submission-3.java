class Solution {
    static List<String> answerList; 

    public String encode(List<String> strs) {
        answerList = strs;
        StringBuilder str = new StringBuilder();

        for (String s : strs) {
            str.append(s);
        }

        return str.toString();
    }

    public List<String> decode(String str) {
        return answerList;
    }
}