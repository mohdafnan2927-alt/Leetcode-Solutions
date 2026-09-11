class Solution {
    public ArrayList<String> generateBinary(int n) {
        ArrayList<String> result = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();

        for(int i = 1; i <= n; i++) {

            int num = i;
            String binary = "";

            while(num != 0) {
                stack.push(num % 2);
                num = num / 2;
            }

            while(!stack.isEmpty()) {
                binary += stack.pop();
            }

            result.add(binary);
        }
        // LeetHub AI Coach: Your logic is correct!
        // Time Complexity: O(n * log(n)) - You iterate n times, and for each number, you perform log2(n) operations.
        // Space Complexity: O(log(n)) for the stack used per number.
        // Optimization Tip: Using a StringBuilder instead of String concatenation (binary += ...) 
        // would be more efficient as Strings are immutable in Java.
        // Alternative Approach: You can use a Queue to generate binary numbers in a BFS manner, 
        // which avoids repeated divisions and stack operations.
        // Your current solution is acceptable for 'Easy' constraints. Feel free to submit!
        return result;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna