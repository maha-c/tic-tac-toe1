package Main;

import java.util.Scanner;

public class Player {
    private String name;
    private String symbol;

    public Player(String name, String symbol) {
        this.name = name;
        this.symbol = symbol;
    }

    public String getName() {
        return name;
    }

    public String getSymbol() {
        return symbol;
    }

    public void play(Board board) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print(name + ", enter row (1-3): ");
            int row = scanner.nextInt() - 1;
            System.out.print(name + ", enter column (1-3): ");
            int col = scanner.nextInt() - 1;
            if (row < 0 || row > 2 || col < 0 || col > 2) {
                System.out.println("Invalid input, please try again.");
            } else if (!board.board[row][col].equals(" ")) {
                System.out.println("That spot is already taken, please try again.");
            } else {
                board.board[row][col] = symbol;
                board.printBoard();
                break;
            }
        }
    }

}
