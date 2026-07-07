class Solution {
    public int search(int[] nums, int target) {
         int n = nums.length;

         int lo = 0, hi=n-1;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            if(nums[mid]==target) return mid;
            else if(nums[lo]<=nums[mid]){ // lo to mid is sorted
                if(nums[lo]<=target && target<nums[mid]) hi = mid - 1;
                else lo = mid + 1;
            }
            else{ // mid to hi is sorted
                if(nums[mid]<target && target<=nums[hi]) lo = mid + 1;
                else hi = mid - 1;
            }
        }
        //or
        // for(int i = 0 ; i<n ; i++){
        //     if(nums[i]==targetget){
        //         return i;
        //     }
        // }
        return -1;
    }
}