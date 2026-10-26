class Solution {
    public int characterReplacement(String s, int k) {
        int freq[] = new int[26];
        for(int i =0;i<26;i++){
            freq[i] = 0;
        }

        int left =0;
        int maxLength =0;
        int maxFrequency= Integer.MIN_VALUE;
        for(int r =0;r<s.length();r++){
           int index = s.charAt(r) -'A';
           freq[index]++;

          maxFrequency = Math.max(maxFrequency, freq[index]);

            while(((r-left+1) - maxFrequency) > k  ){
                 freq[s.charAt(left) - 'A']--;
                 left++;
            }
            maxLength = Math.max(maxLength,r-left+1);
        }

         return maxLength;
    }
}
