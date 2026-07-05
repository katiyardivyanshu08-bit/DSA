class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int n=arr.length;
        int st = 1;
    int end = n-2;
    if (n==1) return 0;                // dought 
    if(arr[0]>arr[1]) return 0;
    if(arr[n-1]>arr[n-2]) return n-1;
    while(st<=end){
        int mid = st+(end-st)/2;
        if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]) return mid;
        else if (arr[mid]>arr[mid-1]) st=mid+1;
        else if (arr[mid]>arr[mid+1]) end=mid-1 ;
        else end=mid-1;
    }
        
    //      for(int i =0 ; i<n ; i++){
    //     if((i==0 || arr[i]>arr[i-1]) && (i==n-1 || arr[i]>arr[i+1])) {
    //         return i ;
    //     }
    // }
    return 0 ;
    }
}
