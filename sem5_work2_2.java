public class sem5_work2_2 {
    private static final int BOARD_SIZE = 8;
    private static int[] queens = new int[BOARD_SIZE];

    public static void main(String[] args) {
        placeQueens(0);
        printBoard();
    }

    private static void placeQueens(int row) {
        if (row == BOARD_SIZE) {
            return;
        }

        for (int col = 0; col < BOARD_SIZE; col++) {
            queens[row] = col;
            if (isValid(row)) {
                placeQueens(row + 1);
            }
        }
    }

    private static boolean isValid(int row) {
        for (int i = 0; i < row; i++) {
            int diff = Math.abs(queens[row] - queens[i]);
            if (diff == 0 || diff == row - i) {
                return false;
            }
        }
        return true;
    }

    private static void printBoard() {
        for (int row = 0; row < BOARD_SIZE; row++) {
            for (int col = 0; col < BOARD_SIZE; col++) {
                if (queens[row] == col) {
                    System.out.print("Q ");
                } else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
    }
}