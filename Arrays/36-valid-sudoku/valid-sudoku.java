class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int row = 0;row<9;row++){
            for(int col = 0;col<9;col++){
                if(board[row][col] == '.'){
                    continue;
                }
                if(!isValid(board,row,col)){
                    return false;
                }
            }
        }
        return true;
    }
    public boolean isValid(char[][]board,int row,int col){
        //Row check
        char num = board[row][col];
        for(int j = 0;j<9;j++){
            if(j!=col && board[row][j] == num){
                return false;
            }
        }
        //Column check
        for(int i = 0;i<9;i++){
            if(i!= row &&board[i][col] == num){
                return false;
            }
        }
        //grid check
        int start_i = (row/3)*3;
        int start_j = (col/3)*3;
        for(int i = start_i;i<start_i+3;i++){
            for(int j = start_j;j<start_j+3;j++){
                if(i == row && j == col){
                    continue;
                }
                if(board[i][j] == num){
                    return false;
                }
            }
        }
        return true;
    }
}