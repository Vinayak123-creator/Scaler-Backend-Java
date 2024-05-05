package TicTacToe.controllers;

import TicTacToe.models.Game;
import TicTacToe.models.GameState;
import TicTacToe.models.Player;
import TicTacToe.stratagies.WinningStrategy;

import java.util.List;

public class GameController {
    public Game startGame(
            int dimension,
            List<Player>players,
            List<WinningStrategy>winningStrategies
    ){
        return Game.getBuilder()
                .setDimension(dimension)
                .setPlayers(players)
                //.addPlayer(new Player())
                .setWinningStrategies(winningStrategies)
                .build();
    }
    public void displayBoard(Game game){
        game.displayBoard();
    }
    public void makeMove(Game game){
        game.makeMove();
    }
    public GameState checkState(Game game){
        return game.getGameState();

    }
    public Player getWinner(Game game){
        return null;
    }
    public void undo(Game game){
        game.undo();
    }
}

//Client->GameController->Service
// 1. Start the game: taking the size, creating the size, creating the player
// 2. while the game state IN_PROGRESS
    // 2.1 Display the board
    // 2.2 Make the Move\

// 3. Based on the game state we will write the result
    //DRAW
    //WINNER

// 4. Undo

