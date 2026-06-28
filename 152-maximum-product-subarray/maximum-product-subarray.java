class Solution {
    public int maxProduct(int[] nums) {
        int n =nums.length ; 
        int a= nums[0];
         for(int i = 0 ; i< n ; i++){
            int m2=1;
            for(int j =i ; j< n ; j++){
                m2*=nums[j];
                a=Math.max(a,m2);
            }
         }
         return a;
    }
}