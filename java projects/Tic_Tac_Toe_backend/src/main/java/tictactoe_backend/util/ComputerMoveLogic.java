package tictactoe_backend.util;

public class ComputerMoveLogic {

	public static int getBestMove(String[] board) {

		// Try to win
		for (int i = 0; i < 9; i++) {
			if (board[i] == null) {
				board[i] = "O";
				if (GameLogic.checkWinner(board) != null) {
					board[i] = null;
					return i;
				}
				board[i] = null;
			}
		}

		// Try to block player
		for (int i = 0; i < 9; i++) {
			if (board[i] == null) {
				board[i] = "X";
				if (GameLogic.checkWinner(board) != null) {
					board[i] = null;
					return i;
				}
				board[i] = null;
			}
		}

		// Pick first available
		for (int i = 0; i < 9; i++) {
			if (board[i] == null) {
				return i;
			}
		}
		
		return -1;
	}
}
