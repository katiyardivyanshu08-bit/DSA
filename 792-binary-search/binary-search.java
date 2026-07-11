class Solution {
    // public int helper (int [] nums ,int target ,int st , int end){
    //     if(st>end) return -1;
    //     int mid = st+(end-st)/2;
    //     if(nums[mid]==target) return mid ;
    //     else if (nums[mid]>target) return helper(nums , target , st , mid-1);
    //     else return helper(nums , target , mid+1 , end);
    // }
    public int search(int[] nums, int target) {
        //binary search (take middile of between number) o(log n)
        //when data is sorted always or strictly increse or decrease binary
        //number next grater before lowest like(162 peak algo)
        int n = nums.length;
        // return helper(nums,target,0,n-1);



        int st = 0;
        int end =n-1;
        while(st<=end){
            int mid = st+(end-st)/2;
            if(nums[mid]==target) return mid;
            else if (nums[mid]<target) st=mid+1;
            else end = mid-1;
         }

        return -1;
    }
}