class Solution {
    public ArrayList<Integer> maxMeetings(int[] s, int[] f) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        int m[][] = new int[s.length][3];
        for(int i =0;i<m.length;i++){
            m[i][0] = i+1;
            m[i][1] = s[i];
            m[i][2] = f[i];
        }
        Arrays.sort(m, Comparator.comparingDouble(o -> o[2]));
        int maxmeet = 1;
        ans.add(m[0][0]);
        int endtime = m[0][2];
        for(int i =1;i<m.length;i++){
            if(m[i][1]>endtime){
                maxmeet++;
                if(endtime == m[i][2]){
                   int min =Math.min(ans.remove(ans.size() -1) ,m[i][0]);
                   ans.add(min);
                }else{
                    ans.add(m[i][0]);
                }
                endtime = m[i][2];
            }
            
        }
        Collections.sort(ans);
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna