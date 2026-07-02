class Solution {
    public String reverseWords(String s) {
        int n=s.length();

        int i=0;
        
        String ans="";
        while(i<n){
            String temp="";
            while(i<n && s.charAt(i)==' '){
                i++;
            }
            while(i<n && s.charAt(i)!=' '){
                temp=temp+s.charAt(i);
                i++;
            }
            
            if(temp.length()>0){
                if(ans.length()==0){
                    ans=ans+temp;
                }
                else{
                    ans=temp+" "+ans;
                }
            }
        }
        // ans=temp+" "+ans;
        return ans; 

        // String [] str = s.trim().split("\\s");
        // int i=0; 
        // int j=str.length-1;
        // // String S ="";
        // while(i<j){
        //     String temp = str[i];
        //     str[i]=str[j];
        //     str[j]=temp;
        //     i++;
        //     j--;
        // }
        // return String.join(" ",str);
        // for(String c : str){
        //     S+=c+" ";
        // }
        // return S;
    }
}