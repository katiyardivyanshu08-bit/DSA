class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int column = matrix[0].length;

        int i=0, j=column-1;
        while(i<row && j>=0){
            if(matrix[i][j]==target) return true;
            else if(matrix[i][j]<target) i++;
            else j--;
        }
        // for(int i=0 ; i<row ; i++){
        //     for(int j=0 ; j<column;j++){
        //         if(matrix[i][j]==target) return true;
        //     }
        // }
        return false;
    }
}