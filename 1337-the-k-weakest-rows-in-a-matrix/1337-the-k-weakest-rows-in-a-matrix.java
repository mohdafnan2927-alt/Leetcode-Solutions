class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        PriorityQueue<soldier> pq = new PriorityQueue<>();
        for(int i =0;i<mat.length;i++){
            int count=0;
            for(int j =0;j<mat[i].length;j++){
                if(mat[i][j] == 1){
                    count +=1;
                }
            }
            pq.add(new soldier(i,count));
        }
        int ans[]= new int[k];
        for(int i =0;i<k;i++){
            ans[i] = pq.remove().row;
        }
        return ans;
    }

    static class soldier implements Comparable<soldier>
    {
        int row;
        int count;

        public soldier(int row,int count){
            this.row = row;
            this.count = count;
        }

        @Override
        public int compareTo(soldier s2) {
            if(this.count == s2.count){
                  return this.row - s2.row;
            }
            return this.count - s2.count;
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna