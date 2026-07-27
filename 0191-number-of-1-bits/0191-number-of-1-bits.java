class Solution {
    public int hammingWeight(int n) {
        int i =0;
        int count =0;
        while(i<32){
            int lastdigit = n & 1;
            if(lastdigit ==1){
                count++;
            }
            n = n>>1;
            i++;
        }
        return count;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna