class Solution {
    public String compressedString(String word) {
        int n=word.length();
        String s = "";
        int i=0;
        while(i<n){
          char c = word.charAt(i);
          int cnt = 0;
          while(cnt<9 && i<n && word.charAt(i)==c){
            cnt++;
            i++;
          }
            s+=Integer.toString(cnt)+c;
        }
        return s ;
    }

}