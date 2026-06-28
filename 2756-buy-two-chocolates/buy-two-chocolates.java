class Solution {
    public int buyChoco(int[] prices, int money) {
    int first = 999;
    int second = 999;
    for(int i=0 ; i<prices.length; i++){
        if (prices[i]<first){
            second = first;
            first = prices[i];
        }
        else if (prices[i] < second){
            second=prices[i];
        }
    }
    int total_p=first+second;
    if(total_p <=money ){
        return money-total_p;
    }
    else return  money ;
    }
}