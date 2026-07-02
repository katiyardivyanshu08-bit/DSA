class Solution {
    private static boolean isVowel(char ch){
        ch=Character.toLowerCase(ch);
        return  ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ;
    }
    public String reverseVowels(String s) {
        int n = s.length();
        char [] arr = s.toCharArray();
        
        int i =0 , j=n-1;
        String t="";
        while(i<j){
            while(i<j && !isVowel(arr[i])) i++;
            while(i<j && !isVowel(arr[j])) j--;
            char temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;

 }
      
        for(char x : arr){
            t+=x;
        }
        return t;

    }
}