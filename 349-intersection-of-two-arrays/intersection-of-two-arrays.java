class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> arr = new ArrayList<>();
        int n1=nums1.length;
        int n2=nums2.length;
        for(int i =0 ; i<n1 ; i++){
            for(int j =0 ; j<n2 ; j++){
                if(nums1[i]==nums2[j] && !arr.contains(nums1[i])){
                    arr.add(nums1[i]);
                    break;
                }
            }
                
            }
        
        int [] a = new int [arr.size()];
        for(int i = 0 ; i<arr.size();i++){
                a[i]=arr.get(i);
            
        }
        return a;
    }

}