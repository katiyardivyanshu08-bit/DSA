class Solution {
    public int maximumCount(int[] nums) {
        int n=nums.length;
        int st1=0;
        int end1=n-1;
        while(st1<=end1){
            int mid=st1+(end1-st1)/2;
            if(nums[mid]>=0) end1=mid-1;
            else st1=mid+1;
        }
        // negative count st1 or end+1

        int st2=0;
        int end2=n-1;
        while(st2<=end2){
            int mid=st2+(end2-st2)/2;
            if(nums[mid]<=0) st2=mid+1;
            else end2=mid-1;
        }
        //for positive count n-st2

        
        return Math.max(st1,(n-st2));
    }
}