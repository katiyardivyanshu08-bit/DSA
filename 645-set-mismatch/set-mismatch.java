class Solution {
    public int[] findErrorNums(int[] nums) {
        // cyclic sort 
        int [] ans = new int[2];
        int n=nums.length;
         int i=0;
        while(i<n){
            int correct=nums[i]-1;
            if(nums[i]!=nums[correct]){
                int temp=nums[i];
                nums[i]=nums[correct];
                nums[correct]=temp;
            }
            else i++;
        }
        for(i=0;i<nums.length;i++){
            if(nums[i]!=i+1) {
                ans[0]=nums[i];    // q 442
                ans[1]=i+1;        // q 645
            }  
        }
        return ans;
    }
}