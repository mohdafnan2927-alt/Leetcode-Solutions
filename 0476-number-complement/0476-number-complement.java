class Solution {
    public int findComplement(int num) {
        int ans =0;
        int idx =0;
        for(int i =31;i>=0;i--){
            if((num & (1<<i))!=0){
                idx = i;
                break;
            }
        }
    for(int i =0;i<=idx;i++){
        int bitn = (num>>i)&1;
        if(num==1){
            return 0;
        }
        if(bitn ==1){
            ans|=(0<<i);
        }else{
            ans|=(1<<i);
        }
    }
    return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna