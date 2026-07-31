class Solution {
    public int fib(int n) {
        if(n<=1) return n;
        // if(n==0 || n==1) return n;
        // return fib(n-1)+fib(n-2);  // O(2powN)

        int sum=0;
        int f=0;
        int s=1;
        for(int i=2;i<=n;i++){
            sum=f+s;
            f=s;
            s=sum;
        }
        return sum;

    }
}