class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int ans[] = new int[2];
        for(int i =0;i<grid.length;i++){
            for(int j =0;j<grid[i].length;j++){
                if(map.containsKey(grid[i][j])){
                    ans[0] = grid[i][j];
                }
                map.put(grid[i][j],map.getOrDefault(grid[i][j],0)+1);
            }
        }
        int n = grid.length;
        for(int i =1;i<=n*n;i++){
            if(!map.containsKey(i)){
                ans[1] = i;
            }
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna