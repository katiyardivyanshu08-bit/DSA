class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // int n1=nums1.length;
        // int n2=nums2.length;
        // for(int i=0 ; i<n1 ; i++){
        //     for(int j=0 ; j<n2 ; j++){
        //         if(nums1[i]>nums2[j]){
        //             int temp=nums1[i];
        //                 nums1[i]=nums2[j];
        //                 nums2[j]=temp;
        //         }
        //         else {
        //             nums1[i]=nums1[i];
        //         }

        //     }
        // }

       int i = 0;
       int j = 0;
       int idx = 0;
       int[] arr = new int[m + n];

        while(i < m && j < n){
            if(nums1[i] <= nums2[j]){
                arr[idx] = nums1[i];
                i++;
            }
            else{
                arr[idx] = nums2[j];
                j++;
            }
            idx++;
        }
        while(i < m){
            arr[idx] = nums1[i];
            i++;
            idx++;
        }
        while(j < n){
            arr[idx] = nums2[j];
            j++;
            idx++;
        }
        for(int k = 0; k < m + n; k++){
            nums1[k] = arr[k];
        }
    }
}