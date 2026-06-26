import java.util.*;

class Solution {
    public int lengthOfLastWord(String s) {
        // s=s.trimmed;
        int count  = 0;
        String S = s.trim();
        int n=S.length();
        for(int i=n-1 ; i>=0 ; i--){

            if(S.charAt(i)==' '){   //"string" , 'charcter'
                break;
            }
            else count++;
        }
        return count;
    }
}

