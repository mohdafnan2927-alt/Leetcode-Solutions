class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> q = new LinkedList<>();
        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < students.length; i++) {
            q.add(students[i]);
        }
        for (int i = sandwiches.length - 1; i >= 0; i--) {
            s.push(sandwiches[i]);
        }
        //check wheter the front value queue matches
        for (int i = 0; i < sandwiches.length; i++) {
            int count = 0;
            while (count < q.size()) {
                int top = s.peek();
                int front = q.peek();
                if (top == front) {
                    s.pop();
                    q.remove();
                    count = 0;
                    break;
                } else {
                    q.add(q.remove());
                    count++;
                }
            }
            if (count == q.size()) {
                return q.size();
            }
        }
        return 0;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna