class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String s1 = strs[0];
        String s2 = strs[strs.length-1];
        int len = Math.min(s1.length(),s2.length());
        String res="";
        for(int i =0 ; i<len ;i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                    break ;
            }
            res+=s1.charAt(i);
        }

        return res;
    }
}