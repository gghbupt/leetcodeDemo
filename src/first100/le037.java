package first100;

public class le037 {
    public void solveSudoku(char[][] board) {
        solve(board);
    }

    public boolean solve(char[][] board) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.') {
                    for (char k = '1'; k <= '9'; k++) {
                        if (checkVaild(board, i, j, k)) {
                            board[i][j] = k;
                            if (solve(board)) {
                                return true;
                            }else {
                                board[i][j] = '.';
                                return false;
                            }
                        }
                    }
                }
            }
        }
        return true;
    }

    public boolean checkVaild(char[][] board, int row, int col, char c) {
        for (int i = 0; i < 9; i++) {
            if (board[row][i] != '.' && board[row][i] == c)
                return false;
            if (board[i][col] != '.' && board[i][col] == c)
                return false;
            if (board[row/3 * 3 + i/3][col/3 * 3 + i%3] != '.' && board[row/3 * 3 + i/3][col/3 * 3 + i%3] == c)
                return false;
        }
        return true;
    }
}
