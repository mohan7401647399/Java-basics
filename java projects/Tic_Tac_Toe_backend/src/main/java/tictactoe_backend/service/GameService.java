package tictactoe_backend.service;

import org.springframework.stereotype.Service;

import tictactoe_backend.exception.InvalidMoveException;
import tictactoe_backend.model.Game;
import tictactoe_backend.util.ComputerMoveLogic;
import tictactoe_backend.util.GameLogic;

@Service
public class GameService {

	private Game game = new Game();

	//	start the game
	public Game startGame() {
		game = new Game();

		return game;
	}

	//	reset the game
	public Game resetGame() {
		game = new Game();

		return game;
	}

	//	game movings
	public Game makeMove(int position) {

		if (position < 0 || position > 8) {
			throw new InvalidMoveException("Position must be between 0 and 8");
		}

		if (game.isGameOver()) {
			throw new InvalidMoveException("Game is already over");
		}

		if (game.getBoard()[position] != null) {
			throw new InvalidMoveException("Cell already occupied");
		}

		// ===== PLAYER MOVE (X) =====
		game.getBoard()[position] = "X";

		// Check winner after player move
		String winner = GameLogic.checkWinner(game.getBoard());

		if (winner != null) {
			game.setWinner(winner);
			game.setGameOver(true);
			return game;
		}

		// Check draw after player move
		if (GameLogic.isDraw(game.getBoard())) {
			game.setDraw(true);
			game.setGameOver(true);
			return game;
		}

		// ===== AI MOVE (O) =====
		int aiMove = ComputerMoveLogic.getBestMove(game.getBoard());

		if (aiMove != -1) {
			game.getBoard()[aiMove] = "O";
		}

		// Check winner after AI move
		winner = GameLogic.checkWinner(game.getBoard());
		if (winner != null) {
			game.setWinner(winner);
			game.setGameOver(true);
			return game;
		}

		// Check draw after AI move ✅ (THIS WAS MISSING)
		if (GameLogic.isDraw(game.getBoard())) {
			game.setDraw(true);
			game.setGameOver(true);
			return game;
		}

		return game;
	}

}
