class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length+1; 
        int sum =(n*(n-1))/2;
        int m =0;

        for(int i : nums) m+=i;
        return  sum-m;
        

    }
}