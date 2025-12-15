package tictactoe_backend.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Game {

	private String[] board = new String[9];
	private String currentPlayer = "X";
	private String winner;
	private boolean gameOver = false;
	private boolean draw = false;
}
