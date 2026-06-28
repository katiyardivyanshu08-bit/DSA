class Solution {
    public int findPeakElement(int[] nums) {
    int n = nums.length;
    // int st = 0;
    // int end = n-1;
    // int i = 0;
    // while(st<=end){
    //     int 
    //     if(nums[i]>)
    // }
    // int i ;
    for(int i =0 ; i<n ; i++){
        if((i==0 || nums[i]>nums[i-1]) && (i==n-1 || nums[i]>nums[i+1])) {
            return i ;
        }
    }
    return 0 ;
    }
}
