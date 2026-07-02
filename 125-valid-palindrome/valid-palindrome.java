class Solution {
    public boolean isPalindrome(String s) {
        if(s==" ") return true;
        s=s.toLowerCase();
        s=s.replaceAll("[^a-z0-9]",""); //regex
        StringBuilder t = new StringBuilder(s);
        t.reverse();
        String x=t.toString();
        if(s.equals(x)) return true;
        else return false;

    }
}