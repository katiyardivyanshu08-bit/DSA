class Solution {
    public int removeDuplicates(int[] nums) {
    int j=1;

    for(int i=1;i<nums.length;i++){
        if(nums[i]!=nums[i-1]) nums[j++]=nums[i];
    }

    return j;
        
    //    int n=nums.length ;
    //    int i=0;
    //    for(int j=1;j<n;j++){
    //     if(nums[i]!=nums[j]){
    //         i++;
    //         nums[i]=nums[j];
    //     }
    //    }
    //    return i+1;
       
    //    int k=0;
    //     nums[k++]=nums[0];
    //     if(nums.length==0) return 0;
    //     for(int i=1;i<n;i++){
    //         if(nums[i]!=nums[i-1]){
    //             nums[k]=nums[i];
    //             k++ ;
    //         }
    //     }
    //     return k;
        
    }
}