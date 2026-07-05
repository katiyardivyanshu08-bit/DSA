class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n=nums.length;
        int [] arr = {-1,-1};
        int st1 =0 , end1=n-1;
        while(st1<=end1){
            int mid = st1+(end1-st1)/2;
            if(nums[mid]==target){
                arr[0]=mid;
                end1=mid-1;
            }
            else if (nums[mid]>target) end1=mid-1;
            else st1=mid+1;
        }

        int st2 =0 , end2=n-1;
        while(st2<=end2){
            int mid = st2+(end2-st2)/2;
            if(nums[mid]==target){
                arr[1]=mid;
                st2=mid+1;
            }
            else if (nums[mid]>target) end2=mid-1;
            else st2=mid+1;
        }
    return arr;
    }
}