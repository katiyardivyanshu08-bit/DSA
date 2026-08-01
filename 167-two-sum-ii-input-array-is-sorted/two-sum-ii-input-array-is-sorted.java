class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        int [] ans = new int[2];
        
        int st=0 , end=n-1;
        while(st<end){
            int sum=nums[st]+nums[end];
            if(sum==target){
                ans[0]=st+1;
                ans[1]=end+1;
                return ans;
            }
            else if (sum>target) end--;
            else st++;
        }
        // for(int i=0;i<n;i++){
        //     for(int j=i+1;j<n;j++){
        //         if(nums[i]+nums[j]==target){
        //             ans[0]=i+1;
        //             ans[1]=j+1;
        //             return ans;
        //         }
        //     }
        // }
        return ans;
    }
}