package Main;

public class Game {
    public static void main(String[] args) {
        Board board = new Board();
        Player player1 = new Player("Player 1", "X");
        Player player2 = new Player("Player 2", "O");

        System.out.println("Welcome to Tic Tac Toe!");
        System.out.println("-----------------------");
        board.printBoard();

        while (true) {
            player1.play(board);
            if (board.checkWin()) {
                System.out.println(player1.getName() + " wins!");
                break;
            }
            if (board.checkDraw()) {
                System.out.println("It's a draw!");
                break;
            }
            player2.play(board);
            if (board.checkWin()) {
                System.out.println(player2.getName() + " wins!");
                break;
            }
            if (board.checkDraw()) {
                System.out.println("It's a draw!");
                break;
            }
        }
    }
}
