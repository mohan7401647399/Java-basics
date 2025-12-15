
const GameStatus = ({game}) => {

    if(game.winner) {
        return <h2 className='status'>Winner: {game.winner}</h2>
    }

    if(game.isDraw && !game.winner && game.gameOver) {
        return <h2 className='status'>It's a Draw!</h2>
    }

  return (
    <h2 className="status">
        Current Turn: {game.currentTurn}
    </h2>
  )
}

export default GameStatus
