class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i =0;i<matrix[0].length;i++){
            for(int j =0;j<matrix.length;j++){
                pq.add(matrix[i][j]);
            }
        }
        int kr = k-1;
        while(kr!=0){
            pq.remove();
            kr--;
        }
        return pq.peek();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna