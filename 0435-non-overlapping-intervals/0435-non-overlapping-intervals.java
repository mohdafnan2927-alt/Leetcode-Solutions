class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        //first step is to sort on the basis of end time
        Arrays.sort(intervals, Comparator.comparingDouble(o -> o[1]));
        int maxchain =1;
        int endtime = intervals[0][1];
        for(int i =1;i<intervals.length;i++){
            if(intervals[i][0]>=endtime){
                maxchain++;
                endtime = intervals[i][1];
            }
        }
        return  intervals.length - maxchain;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna