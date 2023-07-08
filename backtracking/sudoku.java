package backtracking;

public class sudoku {

    public boolean issafe(char[][] board, int row, int col, int number) {
        for (int i = 0; i < board.length; i++) {
            if (board[i][col] == (char) (number + '0')) {
                return false;
            }
        }
        for (int j = 0; j < board.length; j++) {
            if (board[row][j] == (char) (number + '0')) {
                return false;
            }
        }
        // grid
        int sr = (row / 3) * 3;
        int sc = (row / 3) * 3;
        for (int i = sr; i < sr + 3; i++) {
            for (int j = sc; j < sc + 3; j++) {
                if (board[row][col] == (char) (number + '0')) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean helper(char[][] board, int row, int col) {
        if (row == board.length) {
            return true;
        }
        int nrow = 0;
        int ncol = 0;
        if (col == board.length - 1) {
            nrow = row + 1;
            ncol = 0;
        } else {
            nrow = 0;
            ncol = col + 1;
        }
        if (board[row][col] != '.') {
            if (helper(board, nrow, ncol)) {
                return true;
            } else {
                for (int i = 0; i <= 9; i++) {
                    if (issafe(board, row, col, i)) {
                        board[row][col] = (char) (i + '0');
                        if (helper(board, nrow, ncol))
                            return true;
                        else
                            board[row][col] = '.';
                    }
                }
            }
            return false;
        }
    }

    public void sudokusolver(char[][] board) {
        helper(board, 0, 0);
    }
}
