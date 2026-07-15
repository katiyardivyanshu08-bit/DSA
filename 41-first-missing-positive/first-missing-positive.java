class Solution {
    public int firstMissingPositive(int[] nums) {
        // cyclic sort
        int n=nums.length;
        // int i=0;
        // while(i<n){
        //     int correct=nums[i]; // including 0 and nums[i]-1 for st from 1 
        //     if(nums[i]!=nums[correct]){
        //         int temp=nums[i];
        //         nums[i]=nums[correct];
        //         nums[correct]=temp;
        //     }
        //     else i++;
        // }
        Arrays.sort(nums);
        List<Integer> ans=new ArrayList<>();
        for(int x : nums){
            if(x>0) ans.add(x);
        }
        for(int i=1;i<ans.size();){
    if(ans.get(i).equals(ans.get(i-1))) ans.remove(i);
    else i++;
}
       System.out.print(ans);
            int y=1;
        for(int x=0 ; x<ans.size() ; x++){
            if(ans.get(x)!=y){
                return y;
                
            }
            y++;
        }
        return ans.size()+1;
    }
}
