class Solution {
    public List<Integer> getRow(int rowIndex) {
        int n = rowIndex+1;
        List<List<Integer>> arr = new ArrayList<>();
          for(int i = 0; i<n;i++){
             arr.add(new ArrayList<>());  
                for(int j = 0 ; j<=i;j++){
                    if(j==0 || j==i)  arr.get(i).add(j,1);
                    else {
                        int val = arr.get(i-1).get(j)+arr.get(i-1).get(j-1);  // val = arr[i][j]+arr[i][j-1]
                        arr.get(i).add(j,val);
                    }
                }
            }
            return arr.get(rowIndex);
    }
}