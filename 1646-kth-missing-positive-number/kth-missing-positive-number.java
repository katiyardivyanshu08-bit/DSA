class Solution {
    public int findKthPositive(int[] arr, int k) {
        int n = arr.length;
        int num=1;
        int i =0;
        while(k>0){
            if(i<n && arr[i]==num) {i++;}
            else {k-- ;}

            if(k==0) return num;
            num++;
        }
        return -1;
    }

}