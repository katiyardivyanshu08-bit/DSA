class Solution {
    public int missingNumber(int[] nums) {
        // int n = nums.length+1;    // if array from 1 and nums.length if array from 0
        // int sum =(n*(n-1))/2;     //n-1 and (n*(n+1))/2 => use for n
        // int m =0;

        // for(int i : nums) m+=i;
        // return  sum-m;

        // cyclic sort
        int n = nums.length; 
         int i = 0;
        while(i<nums.length){
            if(nums[i] == i || nums[i] == n) i++;
            else{
                int idx = nums[i];
                swap(nums,i,idx);
            }
        }
        for(i=0;i<nums.length;i++){
            if(nums[i] != i) return i;
        }
        return n;
    }

    public static void swap(int[] nums, int i, int idx) {
        int temp = nums[i];
        nums[i] = nums[idx];
        nums[idx] = temp;
    }

    // 1 to n
    // int n=nums.length;
    // int i=0;

    // while(i<n){
    //     if(nums[i]==i+1) i++;
    //     else{
    //         int idx=nums[i]-1;
    //         if(nums[i]!=nums[idx]) swap(nums,i,idx);
    //         else i++;
    //     }
    // }

    // for(i=0;i<n;i++){
    //     if(nums[i]!=i+1) return i+1;
    // }
    // return n+1;

}