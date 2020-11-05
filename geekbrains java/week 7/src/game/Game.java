package game;

import javax.swing.*;

public class Game {
    private GameBoard board;
    private GamePlayer[] gamePlayers = new GamePlayer[2];
    int playersTurn = 0;

    public Game(){
        this.board = new GameBoard(this);
    }

    public void initGame(){
        gamePlayers[0] = new GamePlayer('X', true);
        gamePlayers[1] = new GamePlayer('O', false);
    }

    void passTurn(){
        if (playersTurn == 0){
            playersTurn = 1;
        }
        else{
            playersTurn = 0;
        }
    }

    GamePlayer getPlayer(){return gamePlayers[playersTurn];}

    void showMessage(String text){
        JOptionPane.showMessageDialog(board, text);
    }

}
