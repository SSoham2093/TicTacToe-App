/**
 * TicTacToe
 * UC5 validates whether a move is inside the board boundaries
 * and whether the selected cell is empty.
 */
public class TicTacToe {

    static char[][] board = {
        {'-', '-', '-'},
        {'-', '-', '-'},
        {'-', '-', '-'}
    };

    /**
     * Entry point of the program. Tests the validation logic
     * using sample row and column values.
     */
    public static void main(String[] args) {

        // Test 1: Valid move (empty cell within bounds)
        System.out.println("Test 1 (row:1, col:1): " + isValidMove(1, 1));

        // Test 2: Out of bounds
        System.out.println("Test 2 (row:3, col:3): " + isValidMove(3, 3));

        // Test 3: Cell already occupied
        board[0][0] = 'X';
        System.out.println("Test 3 (row:0, col:0 occupied): " + isValidMove(0, 0));
    }

    /**
     * Checks if the given row and column are within bounds
     * and if the target cell is empty.
     * Input: Row, Column
     * Output: true if valid, false otherwise.
     */
    static boolean isValidMove(int row, int col) {
        // Check boundary conditions
        if (row < 0 || row > 2 || col < 0 || col > 2) {
            System.out.println("Invalid! Position is out of bounds.");
            return false;
        }
        // Check if cell is already occupied
        if (board[row][col] != '-') {
            System.out.println("Invalid! Cell is already occupied.");
            return false;
        }
        return true;
    }
}