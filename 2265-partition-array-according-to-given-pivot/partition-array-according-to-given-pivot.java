class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        // int n=nums.length;
        // int [] ans = new int[n];
        // int cnt1=0;
        // int cnt2=0;
        // int cnt3=0;
        // for(int i=0 ; i<n ; i++){
        //    if(nums[i]<pivot) cnt1++;
        //    else if(nums[i]==pivot) cnt2++;
        //    else cnt3++;
        // }
        // int idx=0;
        // for(int i=0 ;i<cnt1;i++){
        //     if(nums[i]<pivot) ans[i]=nums[i];
        //     idx++;
        // }
        // for(int i=idx ;i<cnt1+cnt2;i++){
        //     if(nums[i]==pivot) ans[i]=nums[i];
        //     idx++;
        // }
        // for(int i=idx ;i<n;i++){
        //     if(nums[i]>pivot) ans[i]=nums[i];
        // }
        // return ans;

    int[] arr = new int [nums.length];
    int count1 = 0;
    int count2 = 0;
    for(int i =0;i<nums.length;i++){
        if (nums[i] < pivot){
            count1++;
        }
        else if(nums[i]==pivot){
            count2++;
        }
    }
    int l =0;
    int j = count1;
    int k = count1+count2;
    for(int i=0;i<nums.length;i++){
        if(nums[i]<pivot){
            arr[l]=nums[i];
            l++;
        }
        else if(nums[i]==pivot){
            arr[j]=nums[i];
            j++;
        }
        else{
            arr[k]=nums[i];
            k++;
        }
    }
    return arr;
    }
}
    