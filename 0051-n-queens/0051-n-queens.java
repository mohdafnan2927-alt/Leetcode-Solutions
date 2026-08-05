class Solution {
    public List<List<String>> solveNQueens(int n) {
         List<List<String>> ans = new ArrayList<>();

        char[][] board = new char[n][n];

        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');
        }

        nqueens(board, 0, ans);

        return ans;
    }

    public static boolean issafe(char[][] board, int row, int col) {

        // column
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        // upper-left diagonal
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        // upper-right diagonal
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        return true;
    }
    public static void nqueens(char[][] board, int row,
                               List<List<String>> ans) {

        if (row == board.length) {

            List<String> temp = new ArrayList<>();

            for (int i = 0; i < board.length; i++) {
                temp.add(new String(board[i]));
            }

            ans.add(temp);
            return;
        }

        for (int col = 0; col < board.length; col++) {

            if (issafe(board, row, col)) {

                board[row][col] = 'Q';

                nqueens(board, row + 1, ans);

                board[row][col] = '.';
            }
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna