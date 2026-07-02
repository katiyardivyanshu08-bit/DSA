import java.util.*;
class Solution {
    public int thirdMax(int[] nums) {
        int n=nums.length;

        long maxi=Long.MIN_VALUE;
        long sMaxi=Long.MIN_VALUE;
        long tMaxi=Long.MIN_VALUE;

        for(int i=0; i<n; i++){
            if(nums[i]>maxi){
                tMaxi=sMaxi;
                sMaxi=maxi;
                maxi=nums[i];
            }
            else if(nums[i]>sMaxi && nums[i]!=maxi){
                tMaxi=sMaxi;
                sMaxi=nums[i];
            }
            else if(nums[i]>tMaxi && nums[i]!=sMaxi && nums[i]!=maxi){
                tMaxi=nums[i];
            }
        }
        if(tMaxi==Long.MIN_VALUE){
            return (int)maxi;
        }
        return (int)tMaxi;
    }
}