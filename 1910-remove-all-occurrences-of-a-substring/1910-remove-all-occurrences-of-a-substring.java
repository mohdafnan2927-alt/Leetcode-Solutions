class Solution {
    public String removeOccurrences(String s, String part) {
        while (true) {
        boolean found = false;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= s.length() - part.length(); i++) {
            if (s.substring(i, i + part.length()).equals(part)) {
                sb.append(s.substring(0, i));
                sb.append(s.substring(i + part.length()));
                s = sb.toString();   // Update the string
                found = true;
                break;                // Remove only the first occurrence
            }
        }
        if (!found) {
            break;                    // No occurrence left
        }
    }
    return s;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna