class Solution {
    public int maxProfit(int[] prices) {
    int current =0;
    int maxp =0;
    int buy = prices[0];
    for(int i=1 ; i<prices.length ; i++){
         buy = Math.min(buy,prices[i]);
         current=prices[i] - buy;
         maxp = Math.max(current , maxp) ;
        }
    
    // for(int i=0 ; i<prices.length ; i++){
    //     int buy = prices[i];
    //     for (int j=i+1 ; j<prices.length ; j++){
    //        current=prices[j] - buy; //[7,1,5] -> 1-5=-6 -> 5-1=4
    //        if(maxp<current){
    //         maxp=current;
    //        }
    //     }
    //     }
       
    return maxp;
    }
        
    
        
    }
