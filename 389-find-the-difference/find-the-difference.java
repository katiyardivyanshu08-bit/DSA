class Solution {
    public char findTheDifference(String s, String t) {
        int n1=s.length();
        int n2=t.length();
        int sum1=0;
        int sum2=0;
        for(int i=0 ; i<n1 ; i++){
            sum1+=s.charAt(i);
        }
        for(int i=0 ; i<n2 ; i++){
            sum2+=t.charAt(i);
        }
        return (char)(sum2-sum1);
    }
}