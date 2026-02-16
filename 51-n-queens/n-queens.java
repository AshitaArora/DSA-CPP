class Solution {
    private void solve(int col,int n,int[][] board,List<List<String>> ans){
        if(col==n){
            ans.add(construct(board,n));
            return;
        }
        for(int row=0;row<n;row++){
            if(safe(row,col,board,n)){
                board[row][col]=1;
                solve(col+1,n,board,ans);
                board[row][col]=0;
            }
        }
    }
    private boolean safe(int row,int col,int[][] board,int n){
        for(int i=0;i<col;i++){
          if(  board[row][i]==1)
            return false;        
    }
    for(int i=row,j=col;i>=0&&j>=0;i--,j--){
       if( board[i][j]==1)
        return false;
    }
    for(int i=row,j=col;i<n&&j>=0;i++,j--){
        if(board[i][j]==1){
            return false;
        }}
        return true;
    }
    private List<String> construct(int[][] board,int n){
        List<String> solution = new ArrayList<>();
        for(int i=0;i<n;i++){
            StringBuilder row = new StringBuilder();
            for(int j=0;j<n;j++){
                if(board[i][j]==1){
                    row.append("Q");
                }
                else{
                    row.append(".");
                }
               
            }
            solution.add(row.toString());
           
        }
            return solution;
    }
    public List<List<String>> solveNQueens(int n) {
       List<List<String>> ans = new ArrayList<>();
       int[][] board = new int[n][n];
       solve(0,n,board,ans);
       return ans;

    }}
