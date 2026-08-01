class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        int [] ans = new int[2];
        for(int i=0;i<n;i++){
            int a=nums[i];
            for(int j=i+1;j<n;j++){
                if(a+nums[j]==target){
                    ans[0]=i+1;
                    ans[1]=j+1;
                    return ans;
                }
            }
        }
        return ans;
    }
}