class Solution {
    public int hammingDistance(int x, int y) {
        int count=0;
      for(int i =0;i<32;i++){
        int bitx = (x>>i)&1;
        int bity = (y>>i)&1;
        if(bitx!=bity){
            count++;
        }
      }  
      return count;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna