class Solution {
    static class pair implements Comparable<pair> {
        int val;
        char key;

        public pair(int val, char key) {
            this.val = val;
            this.key = key;
        }

        @Override
        public int compareTo(pair p2) {
            return p2.val - this.val;
        }
    }

    public String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        PriorityQueue<pair> pq = new PriorityQueue<>();
        for (Character Key : map.keySet()) {
            pq.add(new pair(map.get(Key), Key));
        }
        StringBuilder ans = new StringBuilder("");
        while (!pq.isEmpty()) {
            pair p = pq.poll();

            for (int i = 0; i < p.val; i++) {
                ans.append( p.key);
            }
        }
        return ans.toString();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna