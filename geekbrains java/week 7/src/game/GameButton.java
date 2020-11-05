package game;

import javax.swing.*;

public class GameButton extends JButton {
    private int buttonIndex;
    private GameBoard board;

    public GameButton(int buttonIndex, GameBoard board){
        this.buttonIndex = buttonIndex;
        this.board = board;

        int rowNum = buttonIndex / board.dimension;
        int cellNum = buttonIndex % board.dimension;

        setSize(board.cellSize - 5, board.cellSize - 5);
        addActionListener(new GameActionListener(rowNum, cellNum, this));
    }

    public GameBoard getBoard(){return this.board;}


}
