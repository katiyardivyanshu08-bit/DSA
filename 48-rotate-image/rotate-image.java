class Solution {
    public void rotate(int[][] m) {
        int r = m.length; 
        for(int i = 0 ; i<r ; i++){
            for(int j=0 ; j<i; j++){
                int temp = m[i][j];
                m[i][j]=m[j][i];
                m[j][i]=temp;
            }
        }
        // reverse row
        for(int i = 0 ; i<r ; i++){
            int stCol=0  , endCol=r-1;
            while(stCol<endCol){
                int temp = m[i][stCol];
                m[i][stCol]=m[i][endCol];
                m[i][endCol]=temp;
                stCol++;
                endCol--;
            }
        }
        
    }
}

