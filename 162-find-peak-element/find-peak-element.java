class Solution {
    public int findPeakElement(int[] nums) {
    int n = nums.length;
    int st = 1;
    int end = n-2;
    int i = 0;
    if (n==1) return 0;
    if(nums[0]>nums[1]) return 0;
    if(nums[n-1]>nums[n-2]) return n-1;
    while(st<=end){
        int mid = st+(end-st)/2;
        if(nums[mid]>nums[mid-1] && nums[mid]>nums[mid+1]) return mid;
        else if (nums[mid]>nums[mid-1]) st=mid+1;
        else if (nums[mid]>nums[mid+1]) end=mid-1 ;
        else end=mid-1;
    }
    // for(int i =0 ; i<n ; i++){
    //     if((i==0 || nums[i]>nums[i-1]) && (i==n-1 || nums[i]>nums[i+1])) {
    //         return i ;
    //     }
    // }
    return -1 ;
    }
}
