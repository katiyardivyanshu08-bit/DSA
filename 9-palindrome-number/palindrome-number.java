class Solution {
    public boolean isPalindrome(int x) {
        int rev =0;
        int i =0 ;
        int a=x;
        while(a>0){
            int ld=a%10;
            rev=rev*10+ld;
            a/=10;
            i++;
        }
        if(rev==x) return true;
        else  return false ;
    }
}