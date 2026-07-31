class Solution {
    public String restoreString(String s, int[] indices) {
        int n=indices.length;
        String str="";
        for(int i=0 ; i<n ; i++){
           for(int j=0 ;j<n ; j++){
                if(i==indices[j]){
                    str+=s.charAt(j);
                }
           }
        }
        return str;
    }
}