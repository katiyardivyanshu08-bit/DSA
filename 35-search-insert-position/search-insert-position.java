class Solution {
    public int searchInsert(int[] nums, int target) {       
        int n =  nums.length ;
        // binary search
        int st = 0 ;
        int end = n-1;
        // while(st<=end){
        //     int mid = st+(end-st)/2;
        //     if(nums[mid]==target) return mid;
        //     else if (nums[mid]<target)  st=mid+1;
        //     else end=mid-1; 
        // }
        // return st;
        
        for( int i=0 ; i<n ; i++){
            if(nums[i]>=target){
                return i ;
            }
        }
        return nums.length;   
    }
}