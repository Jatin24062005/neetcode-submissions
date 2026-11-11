class Solution {

    class Element implements Comparable<Element> {
        int data;
        int frequency;

        Element(int data, int f) {
            this.data = data;
            this.frequency = f;
        }

        @Override
        public int compareTo(Element e) {
            return Integer.compare(e.frequency, this.frequency);

            //bda phle so last one first // max-Heap
        }
    }

    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // Step 1: Calculate frequency
        for (int x : nums) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        // Step 2: Create max heap
        PriorityQueue<Element> pq = new PriorityQueue<>();

        for (int x : map.keySet()) {
            pq.add(new Element(x, map.get(x)));
        }

        // Step 3: Extract top K frequent elements
        int[] ans = new int[k];

        for (int i = 0; i < k; i++) {
            ans[i] = pq.poll().data;
        }

        return ans;
    }
}