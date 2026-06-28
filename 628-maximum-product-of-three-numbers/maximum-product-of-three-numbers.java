class Solution {
    public int maximumProduct(int[] nums) {
        int n = nums.length;
        int pro1=1;
        int pro2=1;
        Arrays.sort(nums);
        pro1=nums[n-1]*nums[n-2]*nums[n-3];
        pro2=nums[n-1]*nums[0]*nums[1];
        return Math.max(pro1,pro2);
    }
}