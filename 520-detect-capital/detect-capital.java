class Solution {
    public boolean detectCapitalUse(String word) {
        int n = word.length();
        int cnt=0;
        for(int i=0 ; i<n ; i++){
            if (Character.isUpperCase(word.charAt(i))) cnt++;
        }
        if(cnt==0 ||  cnt==n ||cnt==1 && Character.isUpperCase(word.charAt(0)) )  return true; 

        return false;
    
    }
}