class Solution {
    public boolean checkPerfectNumber(int num) {
        int cnt=0;
        for(int i=1 ; i<num ; i++){
            if(num%i==0) cnt+=i;
        }
        if(num==cnt) return true;
        else return false;
    }
}