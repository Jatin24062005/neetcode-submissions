class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {

        if (hand.length % groupSize != 0) {
            return false;
        }

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int x : hand) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        Arrays.sort(hand);

        for (int i = 0; i < hand.length; i++) {

            int curr = hand[i];

            // Already consumed
            if (map.get(curr) == 0) {
                continue;
            }

            // Start forming a group
            for (int j = 0; j < groupSize; j++) {

                int required = curr + j;

                if (map.getOrDefault(required, 0) == 0) {
                    return false;
                }

                map.put(required, map.get(required) - 1);
            }
        }

        return true;
    }
}