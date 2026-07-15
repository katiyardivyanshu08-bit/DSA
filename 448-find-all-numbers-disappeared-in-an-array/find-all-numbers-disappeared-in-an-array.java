class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        // cyclic sort
         List<Integer> ans=new ArrayList<>();
        int i=0;
        while(i<nums.length){
            int correct=nums[i]-1;
            if(nums[i]!=nums[correct]){
                int temp=nums[i];
                nums[i]=nums[correct];
                nums[correct]=temp;
            }
            else i++;
        }
        for(i=0;i<nums.length;i++){
            if(nums[i]!=i+1) ans.add(i+1);  // <= only this change same as 442
        }
        return ans;
    }
}
