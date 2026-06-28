class Solution {
    public int search(int[] nums, int target) {
        //binary search (take middile of between number) o(log n)
        //when data is sorted always or strictly increse or decrease binary
        //number next grater before lowest like(162 peak algo)

        int n = nums.length;
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