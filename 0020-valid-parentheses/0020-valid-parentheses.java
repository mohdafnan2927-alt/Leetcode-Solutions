class Solution {
    public boolean isValid(String s) {
        Stack<Character> c = new Stack<>();

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '(' ||
                s.charAt(i) == '{' ||
                s.charAt(i) == '[') {

                c.push(s.charAt(i));
            }

            // Closing brackets encountered
            if (s.charAt(i) == ')' ||
                s.charAt(i) == '}' ||
                s.charAt(i) == ']') {

                if (c.isEmpty()) {
                    return false;
                }

                boolean close = false;

                if (s.charAt(i) == ')' && c.peek() + 1 == s.charAt(i)) {
                    close = true;
                    c.pop();
                }

                if (s.charAt(i) == ']' && c.peek() + 2 == s.charAt(i)) {
                    close = true;
                    c.pop();
                }

                if (s.charAt(i) == '}' && c.peek() + 2 == s.charAt(i)) {
                    close = true;
                    c.pop();
                }

                if (!close) {
                    return false;
                }
            }
        }

        return c.isEmpty();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna