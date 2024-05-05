package TicTacToe;

import TicTacToe.controllers.GameController;
import TicTacToe.models.*;
import TicTacToe.stratagies.ColumnWinningStrategy;
import TicTacToe.stratagies.RowWinningStrategy;
import TicTacToe.stratagies.WinningStrategy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        GameController gameController=new GameController();
        System.out.println("Game is Starting");

        try {
            int dimension = 3;
            List<Player> players = new ArrayList<>();
            players.add(new Player(1, "Mohit", PlayerType.HUMAN, new Symbol('X', "Green")));
            players.add(new Bot(2, "Bot", new Symbol('O', "Green"), BotDifficultyLevel.EASY));

            List<WinningStrategy> winningStrategies = new ArrayList<>();
            winningStrategies.add(new RowWinningStrategy());


            Game game = null;
            gameController.displayBoard(game);
            System.out.println("Anyone wants to undo??? (Y/N)");
            String x = sc.next();
            if (x.equals("Y")) {
                gameController.undo(game);
                System.out.println("After UNDO: ");
                gameController.displayBoard(game);
            }
            winningStrategies.add(new ColumnWinningStrategy());

            game = gameController.startGame(dimension, players, winningStrategies);
            gameController.displayBoard(game);
            while (gameController.checkState(game).equals(GameState.IN_PROGRESS)) {
                gameController.makeMove(game);
                gameController.displayBoard(game);
            }

            if (gameController.checkState(game).equals(GameState.SUCCESS)) {
                System.out.println("****** GAME OVER *******");
                System.out.println("Winner is " + game.getWinner().getName());
            } else {
                System.out.println("******GAME OVER*****");
                System.out.println("Game ends is a DRAW!");
            }

        }catch(Exception e){
            System.out.println(e.getMessage());
            System.out.println("Something went wrong please try again later");
        }

//        Game game=gameController.startGame(3,new ArrayList<>(),new ArrayList<>());

//        while (gameController.checkState(game).equals(GameState.IN_PROGRESS)){
//            gameController.displayBoard(game);
//            gameController.makeMove(game);
//        }
//        if(gameController.checkState(game).equals(GameState.DRAW)){
//            System.out.println("The Game ends in a DRAW!");
//        }else if (gameController.checkState(game).equals(GameState.SUCCESS)){
//            System.out.println("The Winner is :"+gameController.getWinner(game));
//        }

    }
}
