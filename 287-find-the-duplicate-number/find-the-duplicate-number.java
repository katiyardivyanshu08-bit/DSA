class Solution {
    public int findDuplicate(int[] nums) {
        int n=nums.length;
        // int i=0;
        // while(i<n){
        //     int correct=nums[i];
        //     if(nums[i]!=nums[correct]){
        //         int temp=nums[i];
        //         nums[i]=nums[correct];
        //         nums[correct]=temp;
        //     }
        //     else i++;
        // }
        Arrays.sort(nums);
        for(int x : nums) System.out.print(x+" ");
        for(int j=0 ; j<n-1 ; j++){
            if(nums[j]==nums[j+1]) return nums[j];
        }

        //tle
        // for(int i=0; i<n ; i++){
        //     int count =0;
        //     for(int j=0 ; j<n ; j++){
        //         if(nums[i]==nums[j]){
        //             count++;
        //         }
        //     }
        //     if(count>1) return nums[i];
        // }
        return -1;
       
    }
}