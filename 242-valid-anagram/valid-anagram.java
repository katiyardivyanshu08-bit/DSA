class Solution {
    public boolean isAnagram(String s, String t) {
    //     int n1=s.length();
    //     int n2=t.length();
    //     if(n1!=n2) return false;

    //     int [] arr1 = new int[26];
    //     int [] arr2 = new int[26];

    //     for(int i =0 ; i<n1 ; i++){     // now here n1=n2
    //         arr1[s.charAt(i)-'a']++;
    //         arr2[t.charAt(i)-'a']++;
    //     }

    //     //  for(int i =0 ; i<n1 ; i++){
    //     //     arr1[s.charAt(i)-'a']++;
    //     // }
    //     // for(int i =0 ; i<n2 ; i++){
    //     //     arr2[t.charAt(i)-'a']++;
    //     // }
        
       
    //     for(int i = 0 ; i<26 ; i++){
    //         if(arr1[i]!=arr2[i]){      //if(arr1==arr2) it check his address
    //             return false ;
    //         }
    //     }
    //     return true ;

    if(s.length()!=t.length()) return false;
        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]!=arr2[i]) return false;
        }
        return true;
     }
}

