class Solution {
    public List<Integer> spiralOrder(int[][] arr) {  //matrix -> arr
          ArrayList<Integer> ans = new ArrayList<>();
        int m = arr.length, n = arr[0].length;
        int minr=0, maxr=m-1,minc=0,maxc=n-1;
        int tEl=m*n;
        while(ans.size()<tEl){
            for(int j=minc;j<=maxc;j++){
                ans.add(arr[minr][j]);
            }
            minr++;
            if(ans.size()==tEl) break;
            for(int i=minr;i<=maxr;i++){
                ans.add(arr[i][maxc]);
            }
            maxc--;
            if(ans.size()==tEl) break;
            for(int j=maxc;j>=minc;j--){
                ans.add(arr[maxr][j]);
            }
            maxr--;
            if(ans.size()==tEl) break;
            for(int i=maxr;i>=minr;i--){
                ans.add(arr[i][minc]);
            }
            minc++;
        }
        return ans;
        
    }
}