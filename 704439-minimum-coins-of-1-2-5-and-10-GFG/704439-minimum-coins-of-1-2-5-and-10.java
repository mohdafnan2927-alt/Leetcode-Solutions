class Solution {
    public int findMin(int n) {
        // code here
        int coins[] = {1, 2, 5, 10};
            int maxcoin = 0;

            for (int i = coins.length - 1; i >= 0; i--) {
                while (n >= coins[i]) {
                    n -= coins[i];
                    maxcoin++;
                }
            }

            return maxcoin;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna