class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        // karels algo
        int max = nums[0];
        int curmax = nums[0];
        for(int i=1 ; i<n ; i++){
            curmax = Math.max(nums[i], curmax+nums[i]);
            max=Math.max(curmax, max);
        }

        // for(int i =0 ; i< n ; i++){
        //     curmax =0;
        //     for(int j =i ; j<n ;j++){
        //         curmax+=nums[j];
        //         max = Math.max(max,curmax);
               
        //     }
        // }

        return max;
    }
}