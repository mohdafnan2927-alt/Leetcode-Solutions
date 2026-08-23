class Solution {
    public Queue<Integer> reverseFirstK(Queue<Integer> q, int k) {
        // code here
        Queue<Integer> nq = new LinkedList<>();
        Stack<Integer> s = new Stack<>();
        if (k > q.size()) {
            return q;
        }
        for(int i =0;i<k;i++){
            s.push(q.remove());
        }
        while(!s.isEmpty()){
            nq.add(s.pop());
        }
        while(!q.isEmpty()){
            nq.add(q.remove());
        }
        return nq;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna