class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length ;
        int maj1=0 , maj2=0;
        int vote1=0 , vote2=0;
        for(int i=0 ; i<n ; i++){
            if(nums[i]==maj1) vote1++;
            else if (nums[i]==maj2) vote2++;
            else if (vote1==0){
                maj1=nums[i];
                vote1=1;
            }
            else if (vote2==0){
                maj2=nums[i];
                vote2=1;
            }
            else {
                vote1--;
                vote2--;
            }
        }
        int cnt1=0 , cnt2=0;
        for(int i =0 ;i<n ; i++){
            if(nums[i]==maj1){
                cnt1++;
            }
            else if (nums[i]==maj2){
                cnt2++;
            }
        }
        ArrayList<Integer> arr = new ArrayList<>();
        if(cnt1>n/3) arr.add(maj1);
        if(cnt2>n/3) arr.add(maj2);
        
        //arraylist
        // ArrayList<Integer> arr = new ArrayList<>();
        
        // for(int i=0;i<nums.length ;i++){
        //     int count = 0;
        //     for(int j=0;j<nums.length ;j++){
        //         if (nums[i]==nums[j]){
        //         count++;
        //         }
        //     }
        // if (count>nums.length/3 && !arr.contains(nums[i])){
        //     arr.add(nums[i]);
        // }
        
        // }
        return arr;
    }
}