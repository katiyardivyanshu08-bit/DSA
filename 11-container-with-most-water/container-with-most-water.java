class Solution {
    // max  profit or max area approch -> two pointer
    public int maxArea(int[] height) {
        int i=0;
        int j=height.length-1;
        int maxwater = 0;
        int currarea =0;
    while(i<j){
        
            int length = Math.min(height[i],height[j]);
            int width = j-i; 
            currarea=length * width ;
            maxwater = Math.max(currarea,maxwater);    
            if (height[i]<height[j]){
                i++;
            }
            else j--;
    }
     
        return maxwater;
    }
}
   // return maxwater;
        // int maxwater = 0;
        // int currarea =0;
        // for(int i = 0 ; i<height.length-1 ; i++){
        // for(int j = i+1 ; j<height.length ; j++){
        //     int length = Math.min(height[i],height[j]);
        //     int width = j-i; 
        //     currarea=length * width ;
        //     maxwater = Math.max(currarea,maxwater);    
            
        // }
        // }
        // return maxwater;
    
        // int first = -999;
        // int second = -999;
        // for(int i = 0 ; i<height.length ; i++){
        //     if(height[i]>first){
        //         second = first ;
        //         first = height[i];
        //     }
        //     else if (height[i]>second && height[i]!=first){
        //         second = height[i];
        //     }
        // }
        // if (second == -999){
             
        //     return 1;
        // }
        // else return second*second;