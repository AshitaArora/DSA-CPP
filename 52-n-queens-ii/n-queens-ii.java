class Solution {
    int count =0;
    public int totalNQueens(int n) {
        int[] [] board = new int[n][n];
        solve(0,n,board);
        return count;
    }
    private void solve(int col,int n,int[][] board){
        if(col==n){
            count++;
            return;
        }
        for(int row =0;row<n;row++){
            if(safe(row,col,n,board)){
                board[row][col]=1;
                solve(col+1,n,board);
                board[row][col]=0;

            }
        }
    }
    private boolean safe(int row,int col,int n,int[][] board){
        for(int i=0;i<col;i++){
           if( board[row][i]==1)
            return false;
        }
        for(int i=row,j=col;i>=0&&j>=0;i--,j--){
            if(board[i][j]==1)return false;
        }
        for(int i=row,j=col;i<n&&j>=0;i++,j--){
            if(board[i][j]==1)return false;
        }
        return true;
    }
}