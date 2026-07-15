class Solution {
        // cyclic sort
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public int firstMissingPositive(int[] nums) {
        int i = 0, n = nums.length; // 1 to n
        while(i<n){
            // dry run => {9 -4 3 1 7 3 0}
            if(nums[i]<=0) i++;
            else if(nums[i]>n) i++;
            else if(nums[i]==i+1) i++; // already at correct place
            else if(nums[i]==nums[nums[i]-1]) i++; // +ve duplicate
            else swap(nums,i,nums[i]-1);
        }
        for(i=0;i<n;i++){
            if(nums[i] != i+1) return i+1;
        }
        return n+1;    

    //     numsays.sort(nums);
    //     List<Integer> ans=new numsayList<>();
    //     for(int x : nums) if(x>0) ans.add(x);

    //     for(int i=1;i<ans.size();){
    //         if(ans.get(i).equals(ans.get(i-1))) ans.remove(i);
    //         else i++;
    //     }
    //       // System.out.print(ans);
    //     int y=1;
    //     for(int x=0 ; x<ans.size() ; x++){
    //         if(ans.get(x)!=y) return y;
    //         y++;
    //     }
    //     return ans.size()+1;
    }
}
