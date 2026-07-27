class Solution {
    public int[] countBits(int n) {
        int ans[] = new int[n+1];
        for(int i =0;i<=n;i++){
            int num =i;
            int j =0;
            int count=0;
            while(j<32){
                if((num&1)==1){
                    count++;
                }
                num= num>>1;
                j++;
            }
            ans[i] = count;
        }
    
    return ans;
    }
    
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna