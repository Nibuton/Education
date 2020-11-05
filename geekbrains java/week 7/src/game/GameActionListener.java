package game;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class GameActionListener implements ActionListener {

    private int row;
    private int cell;
    GameButton button;

    GameActionListener(int row, int cell, GameButton button){
        this.row = row;
        this.cell = cell;
        this.button = button;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        GameBoard board = button.getBoard();
        if (board.isTurnable(row, cell)) {
            updateByPlayersData(board);
            if (!board.isEmpty()){
                board.getGame().passTurn();
                updateByAIData(board);
                board.getGame().passTurn();
            }
        }
        else{
                board.getGame().showMessage("Incorrect turn");
            }
    }

    void updateByPlayersData(GameBoard board){
        button.setText(Character.toString(board.getGame().getPlayer().getPlayerSign()));
        board.updateGameField(row,cell);
    }

    void updateByAIData(GameBoard board){

        int x = -1;
        int y = -1;
        int max_score = 0;

        for (int i = 0; i < board.dimension; i++) {
            for (int j = 0; j < board.dimension; j++) {
                int current_score = 0;
                if (board.isTurnable(i, j)) {
                    current_score = board.cellScore(i, j);
                }
                if (current_score >= max_score) {
                    x = i;
                    y = j;
                    max_score = current_score;
                }
            }
        }
        int cellIndex = board.dimension*x + y;
        board.getButton(cellIndex).setText(Character.toString(board.getGame().getPlayer().getPlayerSign()));

        board.updateGameField(x,y);
    }
}
