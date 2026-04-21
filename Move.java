/**
 * TicTacToe
 * UC6 places a player's symbol on the board at the given position.
 * This use case focuses on updating game state.
 */
public class TicTacToe {

    static char[][] board = new char[3][3];

    /**
     * Entry point of the program. Places a sample move
     * and prints the updated cell value.
     */
    public static void main(String[] args) {

        // Initialize board with '-'
        for (int row = 0; row < 3; row++)
            for (int col = 0; col < 3; col++)
                board[row][col] = '-';

        // Test 1: Place 'X' at (0,0)
        placeMove(0, 0, 'X');
        System.out.println("board[0][0] = " + board[0][0]);

        // Test 2: Place 'O' at (1,1)
        placeMove(1, 1, 'O');
        System.out.println("board[1][1] = " + board[1][1]);

        // Print full board after moves
        System.out.println("\n--- Board After Moves ---");
        printBoard();
    }

    /**
     * Updates the board by placing the given symbol at
     * the specified row and column.
     * Input: Row, Column, Symbol
     * Hint: Assume the move is already validated.
     */
    static void placeMove(int row, int col, char symbol) {
        board[row][col] = symbol;
    }

    // Helper: Print board to visualize state
    static void printBoard() {
        System.out.println("--------------");
        for (int row = 0; row < 3; row++) {
            System.out.print("| ");
            for (int col = 0; col < 3; col++) {
                System.out.print(board[row][col] + " | ");
            }
            System.out.println();
            System.out.println("--------------");
        }
    }
}