class Solution {
    public int reverse(int x) {
        long rev = 0;
        long a = Math.abs(x);
        long sign = (x>0)?1:-1;
        while(a>0){
            long ld = a%10;
            rev=rev*10+ld;
            a/=10;
        }
        long p= rev*sign;
        if(p>Integer.MAX_VALUE || p<Integer.MIN_VALUE) return 0;
        return (int)p ;
    }
}

