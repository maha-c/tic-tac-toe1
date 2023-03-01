package Main;

public class Board {
    public String[][] board;

    public Board() {
        board = new String[3][3];
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                board[row][col] = " ";
            }
        }
    }

    public void printBoard() {
        for (int row = 0; row < 3; row++) {
            System.out.println(board[row][0] + "|" + board[row][1] + "|" + board[row][2]);
            if (row < 2) {
                System.out.println("-+-+-");
            }
        }
    }

    public boolean checkWin() {
        // Check rows
        for (int row = 0; row < 3; row++) {
            if (board[row][0].equals(board[row][1]) && board[row][1].equals(board[row][2]) && !board[row][0].equals(" ")) {
                return true;
            }
        }
        // Check columns
        for (int col = 0; col < 3; col++) {
            if (board[0][col].equals(board[1][col]) && board[1][col].equals(board[2][col]) && !board[0][col].equals(" ")) {
                return true;
            }
        }
        // Check diagonals
        if (board[0][0].equals(board[1][1]) && board[1][1].equals(board[2][2]) && !board[0][0].equals(" ")) {
            return true;
        }
        if (board[0][2].equals(board[1][1]) && board[1][1].equals(board[2][0]) && !board[0][2].equals(" ")) {
            return true;
        }
        return false;
    }

    public boolean checkDraw() {
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                if (board[row][col].equals(" ")) {
                    return false;
                }
            }
        }
        return true;
    }
}
