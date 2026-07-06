class Solution {
    public int mySqrt(int x) {
        int st =1;
        int end = x;
        while(st<=end){
            int mid=st+(end-st)/2;
            if(mid == x/mid) return  mid;  //mid*mid==x
            else if(mid > x/mid) end=mid-1;
            else st=mid+1;
        }
        return  end;
    }
}