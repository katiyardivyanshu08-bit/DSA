class Solution {
    public int strStr(String haystack, String needle) {
        int n1 = haystack.length(); 
        int n2 = needle.length(); 
        for(int i=0 ; i<=n1-n2 ;i++ ){
            for(int j=0 ; j<n2 ; j++){
                if(haystack.charAt(i+j)!=needle.charAt(j)){
                    break;
                } 
                if (j==n2-1) return i;
            }
        }
        return -1;
        // if(haystack.contains(needle)){
        //     return 0;
        // }
        // else return -1;
    }
}