class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int r=matrix.length;
        int c=matrix[0].length;

        int lo = 0, hi = r*c-1;
        while(lo<=hi){
            int mid = (lo+hi)/2;
            int midRow = mid/c, midCol = mid%c;  //?
            if(matrix[midRow][midCol]==target) return true;
            else if(matrix[midRow][midCol]>target) hi = mid - 1;
            else lo = mid + 1;
        }

        //or
        // for(int i =0 ; i<r ; i++ ){
        //     for(int j =0 ; j<c; j++){
        //         if(matrix[i][j]==target){
        //             return true;
        //         }
        //     }
        // }
    return false;

    }
}