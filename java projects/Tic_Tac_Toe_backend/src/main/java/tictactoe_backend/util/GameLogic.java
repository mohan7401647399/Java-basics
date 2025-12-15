package tictactoe_backend.util;

public class GameLogic {

	public static final int[][] WIN_PATTERNS = { { 0, 1, 2 }, { 3, 4, 5 }, { 6, 7, 8 }, { 0, 3, 6 }, { 1, 4, 7 },
			{ 2, 5, 8 }, { 0, 4, 8 }, { 2, 4, 6 } };

	public static String checkWinner(String[] board) {
		for (int[] p : WIN_PATTERNS) {
			if (board[p[0]] != null && board[p[0]].equals(board[p[1]]) && board[p[1]].equals(board[p[2]])) {
				return board[p[0]];
			}
		}
		return null;
	}

	public static boolean isDraw(String[] board) {
		if (checkWinner(board) != null) {
			return false;
		}

		for (String cell : board) {
			if (cell == null)
				return false;
		}
		return true;
	}

}
