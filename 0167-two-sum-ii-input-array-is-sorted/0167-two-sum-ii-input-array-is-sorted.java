class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int lp=0;
        int rp = numbers.length -1;
        int arr[] = new int[2];
        while(lp<rp){
            if((numbers[lp]+numbers[rp])==target){
                arr[0] = lp+1;
                arr[1] = rp+1;
                break;
            }
            if((numbers[lp]+numbers[rp])<target){
                lp++;
            }else{
                rp--;
            }
        }
        
        return arr;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna