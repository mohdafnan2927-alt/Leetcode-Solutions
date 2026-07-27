class Solution {
    public int singleNumber(int[] nums) {
      int curr = nums[0];
    for(int i =1;i<nums.length;i++){
        curr = curr^nums[i];
    }
    return curr;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna