class Solution {
    public String getSmallestString(int n, int k) {
        StringBuilder ans = new StringBuilder();
        for(int i =0;i<n;i++){
            ans.append('a');
        }
        int extra = k-n;
        for(int i =n-1;i>=0;i--){
            if(extra>=25){
                char ch = (char)('a' + 25);
                ans.setCharAt(i, ch);
                extra -=25;
            }else{
                char ch = (char)('a'+extra);
                ans.setCharAt(i,ch);
                break;
            }
        }
        return ans.toString();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna