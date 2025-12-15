import React, { useEffect, useState } from 'react';
import { startGame, resetGame, makeMove } from '../services/gameService.jsx';
import GameStatus from '../components/GameStatus.jsx';
import Board from '../components/Board.jsx';

const GamePage = () => {

    const [game, setGame] = useState(null);

    useEffect(() => {
        startGame().then(setGame);
    }, []);

    const handleMove = async (index) => {
        if (!game || game.winner || game.board[index]) return;
        const updatedGame = await makeMove(index);
        setGame(updatedGame);
    };

    const handleReset = async () => {
        const newGame = await resetGame();
        setGame(newGame);
    };

    if (!game) return <h2 className='loading'>Loading...</h2>

    return (
        <div className='container'>
            <h1 className='title'>Tic Tac Toe</h1>
            <GameStatus game={game} />
            <Board board={game.board} onMove={handleMove} />
            <button className='reset-button' onClick={handleReset}>
                Reset Game
            </button>
        </div>
    )
}

export default GamePage
