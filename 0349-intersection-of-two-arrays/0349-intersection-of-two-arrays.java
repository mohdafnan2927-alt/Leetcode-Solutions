class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<nums1.length;i++){
            set.add(nums1[i]);
        }
        HashSet<Integer> res = new HashSet<>();
        for(int i=0;i<nums2.length;i++){
            if(set.contains(nums2[i])){
                res.add(nums2[i]);
            }
        }
        int i=0;
        int arr[] = new int[res.size()];
        Iterator<Integer> it = res.iterator();
        while(it.hasNext()){
            arr[i] = it.next();
            i++;
        }
        return arr;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna