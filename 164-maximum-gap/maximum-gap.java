class Solution {
    public int maximumGap(int[] nums) {
        int n = nums.length ;
        Arrays.sort(nums);
        int maxg = 0; 
        int curg = 0; 
        for(int i =0 ; i<n-1 ;i++){
            curg=nums[i+1]-nums[i];
            maxg=Math.max(maxg,curg);
        
        }
        return maxg;
    }
}