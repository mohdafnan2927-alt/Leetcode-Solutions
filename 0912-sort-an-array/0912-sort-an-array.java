class Solution {
    public int[] sortArray(int[] nums) {
        mergesort(nums, 0, nums.length - 1);
        return nums;
    }
    public static void mergesort(int nums[],int si,int ei){
         if(si>=ei){
            return;
        }
        int mid = (si+ei)/2;
        mergesort(nums,si,mid);
        mergesort(nums,mid+1,ei);
        merge(nums,si,mid,ei);
    }
    public static void merge(int nums[],int si,int mid,int ei){
        int temp[] = new int[ei-si+1];
        int i =si;
        int j = mid+1;
        int k =0;
        while(i<=mid && j<=ei){
            if(nums[i]<nums[j]){
                temp[k++] = nums[i++];
            }else{
                temp[k++] = nums[j++];
            }
        }
        while(i<=mid){
            temp[k++] = nums[i++];
        }
        while(j<=ei){
            temp[k++] = nums[j++];
        }
        for(k=0,i=si;k<temp.length;k++,i++){
            nums[i] = temp[k];
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna