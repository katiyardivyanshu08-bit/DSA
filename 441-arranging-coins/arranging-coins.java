class Solution {
     public int mySqrt(long x) {
        long st =1;
        long end = x;
        while(st<=end){
            long mid=st+(end-st)/2;
            if(mid == x/mid) return (int) mid;  //mid*mid==x
            else if(mid > x/mid) end=mid-1;
            else st=mid+1;
        }
        return (int) end ;
     }
    public int arrangeCoins(int n) {
        long m= n;                        // long m = (long) n
        return (mySqrt(8*m+1)-1)/2;
    }
}