class Solution {
    public int majorityElement(int[] nums) {
       // mores algo for voting
    int n = nums.length ;
    int cnt = 0;
    int ele =0 ;
    for(int i = 0 ; i<n ; i++){
        if(cnt==0){
            cnt =1;
            ele = nums[i];
        }
        else if (nums[i]==ele) cnt++;
        else cnt--;
    }
    int cnt1 = 0;
    for(int i = 0 ; i< n ; i++){
        if(nums[i]==ele) cnt1++;
    }
    if(cnt1>n/2) return ele;
    
    //     Arrays.sort(nums);
    //    return nums[nums.length/2] ;

    
    
//     for(int i=0;i<nums.length;i++){
//         int count=0;
//         for (int j=0;j<nums.length ; j++){
//             if(nums[i]==nums[j]){
//                 count++;
//             }
//         }
//         if (count>nums.length/2){
//             return nums[i];
//         }
    
//     }
    
 return 0;
}
}