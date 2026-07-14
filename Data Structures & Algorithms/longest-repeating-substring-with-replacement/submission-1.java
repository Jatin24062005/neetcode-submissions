class Solution {
    public int characterReplacement(String s, int k) {
        int map[]= new int[26];
        int left =0;
        int maxFrequency =0;
        int maxlength =0;
        for(int right = 0;right<s.length();right++){
            char a = s.charAt(right);
            map[a-'A']++;

            maxFrequency = Math.max(maxFrequency,map[a-'A']);
            int windowSize = right-left+1;
            if((windowSize - maxFrequency) > k){
                char leftChar = s.charAt(left);
                map[leftChar -'A']--;
                left++;
            }
            maxlength = Math.max(maxlength,right-left+1);
        }
        
        return maxlength;
    }
}
