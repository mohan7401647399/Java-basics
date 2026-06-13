package tictactoe_backend.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import tictactoe_backend.model.Game;
import tictactoe_backend.model.MoveRequest;
import tictactoe_backend.service.GameService;

@RestController
@RequestMapping("/api/game")
@CrossOrigin(
    origins = "http://localhost:5173",
    allowedHeaders = "*",
    methods = { org.springframework.web.bind.annotation.RequestMethod.GET,
                org.springframework.web.bind.annotation.RequestMethod.POST,
                org.springframework.web.bind.annotation.RequestMethod.OPTIONS }
)
@AllArgsConstructor
public class GameController {

    private final GameService gameService;

    @PostMapping("/start")
    public Game startGame() {
        return gameService.startGame();
    }

    @PostMapping("/move")
    public Game makeMove(@RequestBody MoveRequest request) {
        return gameService.makeMove(request.getPosition());
    }

    @PostMapping("/reset")
    public Game resetGame() {
        return gameService.resetGame();
    }
}
