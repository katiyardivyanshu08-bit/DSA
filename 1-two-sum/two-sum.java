class Solution {
    
    public int[] twoSum(int[] nums, int target) {
        int [] arr = new int [2];
        int n=nums.length;
      for(int i=0 ; i<n ; i++){
        for(int j=i+1 ; j<n ; j++){
            if(nums[i]+nums[j]==target){
                arr[0]=i;
                arr[1]=j;
            }
        }
      }  
      return arr;

        // if ans in true and false
    //     Arrays.sort(nums); //O(nlogn) 
    //     int i=0 ,j=n-1;
    //     while(i<j){
    //         if(nums[i]+nums[j]==target) return true
    //         else if (nums[i]+nums[j]>target) j--;
    //         else i++;
            
    //     }
    //   return false;
    }
}
