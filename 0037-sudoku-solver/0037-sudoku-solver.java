class Solution {
    public void solveSudoku(char[][] board) {
        sudokosolver(board,0,0);
    }
    public static boolean issafe(char board[][],int row,int col,char digit){
        //row
        for(int j=0;j<9;j++){
            if(board[row][j] == digit){
                return false;
            }
        }
        //col
        for(int i =0;i<9;i++){
            if(board[i][col]==digit){
                return false;
            }
        }
        //grid
        int startrow = (row/3)*3;
        int startcol = (col/3)*3;
        for(int i = startrow;i<startrow+3;i++){
            for(int j = startcol;j<startcol+3;j++){
                if(board[i][j] == digit){
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean sudokosolver(char board[][],int row,int col){
        //basecase
        if(row==9){
            // printboard(board);
            return true;
        }
        int newrow = row;
        int newcol = col+1;
        if(col+1==9){
            newrow = row+1;
            newcol = 0;
        }
        if(board[row][col] != '.'){
            return sudokosolver(board,newrow,newcol);
        }
        for(char digits='1';digits<='9';digits++){
            if(issafe(board,row,col,digits)){
                board[row][col] = digits;
                if(sudokosolver(board,newrow,newcol)){
                    return true;
                }
                board[row][col] = '.';
            }
        }
        return false;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna