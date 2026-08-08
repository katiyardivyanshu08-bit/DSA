class Solution {
    public int maxFrequencyElements(int[] nums) {
      int n=nums.length;
      int [] freq = new int[101];
      int fl=freq.length;
      for(int i=0;i<n;i++){
        freq[nums[i]]++;
      }
      int max=0;
      for(int i=0;i<fl;i++){
        if(freq[i]>max){
            max=freq[i];
        }
      }
      int ans=0;
      for(int i=0 ;i<fl;i++){
        if(freq[i]==max){
            ans+=freq[i];
        }
      }
    return ans;
    //   for(int i=0 ; i<n ; i++){
    //     int a=nums[i];
    //     for(int j=i+1 ; j<n ; j++){
    //         if(nums[j]==a) {
    //             arr[i]=a++;
    //         }
    //     }
    //   }

    //   int max=arr[0];
    //   for(int i=0 ; i<n ;i++){
        
    //     for(int j=0 ; j<n ;j++){
    //         if(arr[j]>max){
    //             max=arr[j];
    //         }
    //     }
    //   }
    //   return max;
    }
}