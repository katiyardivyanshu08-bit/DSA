class Solution {
    public int findKthPositive(int[] arr, int k) {
        int n = arr.length;
        int lo = 0, hi = n - 1;
        while(lo<=hi){
            int mid = (lo+hi)/2;
            int correctNo = mid + 1;
            int missing = arr[mid] - correctNo;
            if(missing>=k) hi = mid - 1;
            else lo = mid + 1;
        }
        return hi + 1 + k;
        //or
        // int num=1;
        // int i =0;
        // while(k>0){
        //     if(i<n && arr[i]==num) {i++;}
        //     else {k-- ;}

        //     if(k==0) return num;
        //     num++;
        // }
        // return -1;
    }

}