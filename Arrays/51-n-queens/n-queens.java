class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new ArrayList<>();
        char [][] board = new char[n][n];
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                board[i][j] = '.';
            }
        }
        solve(0,n,board,result);
        return result;
    }
    public static void solve(int row,int n,char [][] board,List<List<String>> result){
        if(row == n){
            List<String> temp = new ArrayList<>();
            for(int i = 0;i<n;i++){
                temp.add(new String(board[i]));
            }
            result.add(temp);
            return;
        }
         for(int col = 0; col < n; col++) {
            if(isSafe(row, col, n,board)){
                board[row][col] = 'Q';
                solve(row + 1, n, board,result);
                board[row][col] = '.';
            }
        }
    }
    public static boolean isSafe(int row,int col,int n,char [][]board){
        int r = row;
        int c = col;
        while(r>=0){
            if(board[r][c] == 'Q'){
                return false;
            }
            r--;
        }
        r = row;
        c = col;
        while(r>=0 && c >= 0){
            if(board[r][c] == 'Q'){
                return false;
            }
            r--;
            c--;
        }
        r= row;
        c = col;
        while(r>=0 && c<n){
            if(board[r][c] == 'Q'){
                return false;
            }
            r--;
            c++;
        }
        return true;
    }
}