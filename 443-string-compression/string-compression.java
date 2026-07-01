class Solution {
    public int compress(char[] chars) {
        int n=chars.length;
        if(n==1) return 1;
        int index=0;
        int i=0;
        while(i<n){
            char ch = chars[i];
            int count=0;
            while(i<n && ch==chars[i]){
                count++;
                i++;
            }
            chars[index]=ch;
            index++;

            if(count>1){
                String str = Integer.toString(count);
                for( int  k = 0 ;k<str.length();k++){
                    chars[index] = str.charAt(k);
                    index++;
                }
             }
        }
    return index;   

    }
}