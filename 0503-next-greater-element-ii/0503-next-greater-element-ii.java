class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> s = new Stack<>();
        int nxt[] = new int[nums.length];
        for(int i = 2*nums.length -1;i>=0;i--){
             int index = i % nums.length;
            while(!s.isEmpty() && nums[s.peek()]<=nums[index]){
                s.pop();
            }
            if(s.isEmpty()){
                nxt[index] = -1;
            }else{
                nxt[index] = nums[s.peek()];
            }
            s.push(index);
        }
        return nxt;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna