class Solution {
    public int balancedStringSplit(String s) {
        int count =0;
        int split =0;
        for(int i =0;i<s.length();i++){
            
            if(s.charAt(i)=='L'){
                count++;
            }
            if(s.charAt(i) == 'R'){
                count--;
            }
            if(count==0){
                split++;
                count=0;
            }
        }
        return split;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna