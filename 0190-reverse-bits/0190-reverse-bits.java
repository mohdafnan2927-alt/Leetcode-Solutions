class Solution {
    public int reverseBits(int n) {
        int newbit =0;
    int i =0;
    while(i<32){
        int lastbit = n&1;
        n = n>>1;
        newbit = (newbit<<1) |lastbit;
        i++;
    }
    return newbit;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna