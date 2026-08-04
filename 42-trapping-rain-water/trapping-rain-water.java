class Solution {
    public int trap(int[] h) {
        int n=h.length;
        int sum=0;
        int [] left = new int[n];
        int [] right = new int[n];
        left[0]=h[0];
        right[n-1]=h[n-1];
        for(int i=1 ;i<n ;i++){
            left[i]=Math.max(left[i-1],h[i]);
        }
        for(int i=n-2 ;i>=0 ;i--){
            right[i]=Math.max(right[i+1],h[i]);
        }
        for(int i=0 ; i<n ; i++){
            int min=Math.min(left[i],right[i]);
            min-=h[i];
            sum+=min;
        }
        return sum;

        // int twater=0;
        // for(int i=0 ; i<n-1; i++){
        //     int bar=h[i];

        //     int leftmax=bar;
        //     int rightmax=bar;

        //     for(int j=i-1 ; j>=0 ; j--){
        //         leftmax=Math.max(leftmax , h[j]);
        //     }
        //     for(int j=i+1 ; j<n ; j++){
        //         rightmax=Math.max(rightmax , h[j]);
        //     }
        //     twater+=Math.min(rightmax,leftmax)-bar;
        // }
        // return twater;
    }
}