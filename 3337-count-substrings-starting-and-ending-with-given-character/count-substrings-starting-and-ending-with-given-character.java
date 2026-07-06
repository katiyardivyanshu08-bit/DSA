class Solution {
    public long countSubstrings(String s, char c) {
        int n=s.length();
        long cnt =0;
        for(int i=0 ; i<n ; i++){
            if(s.charAt(i)==c) cnt++;
        }
        return cnt*(cnt+1)/2;
    }
}