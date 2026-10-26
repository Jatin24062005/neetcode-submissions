class Solution {
    public boolean checkInclusion(String s1, String s2) {
        HashMap<Character, Integer> m1 = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            m1.put(s1.charAt(i), m1.getOrDefault(s1.charAt(i), 1) + 1);
        }

        for (int left = 0; left < s2.length(); left++) {
            char x = s2.charAt(left);

            if (s1.contains(String.valueOf(x))) {
                HashMap<Character, Integer> m2 = new HashMap<>();
                int right = left;
                while ( right < s2.length() && (right- left) < s1.length() ) {
                       char y = s2.charAt(right);
                    if (!s1.contains(String.valueOf(y))) {
                        break;
                    } else {
                        m2.put(s2.charAt(right), m2.getOrDefault(s2.charAt(right), 1) + 1);
                    }
                    right++;
                }

                if (m2.equals(m1)) {
                    return true;
                }
            }
        }

        return false;
    }
}
