package Main;

enum Status {
    // there is a row, column or diagonal consisting of only player1's game pieces:
    PLAYER1_WON,
    // there is a row, column or diagonal consisting of only player2's game pieces:
    PLAYER2_WON,
    // there is no row, column, or diagonal consisting of a single player's pieces:
    TIE,
    // there are spots on the board which are uninitialized;
    UNFINISHED
}

public class Game {
    Player player1;
    Player player2;
    Board board;

    // this function should prompt the players for names and gamePiece and assign it
    // to the player objects:
    private void initPlayers() {
        return;
    }

    // this method should let each player pick a spot and also print the board between selections:
    private void round() {

    }

    // This should return a status of the board, using the enum Status:
    private Status getStatus() {
        return Status.UNFINISHED;

    }

    // 1. Set up, ask players for names and game piece
    // 2. For each round, let each player pick a spot
    // 3. Print the board after each move:
    // 4. When the game is over, announce the winner or that it is a tie
    public static void main(String[] args) {
    }


}
