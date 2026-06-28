class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n =  nums.length;
            int count = 0;
            int maxc =0;
        for(int i =0 ; i<n;i++){
            if(nums[i]==1){
                count++;
                // maxc=Math.max(maxc,count);
            }
            else {
                maxc=Math.max(maxc,count);
                count=0;
            }
            }
             maxc=Math.max(maxc,count);
            return maxc;
        
    }
}