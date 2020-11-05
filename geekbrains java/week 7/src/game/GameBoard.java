package game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class GameBoard extends JFrame {
    static int dimension = 3;
    static int cellSize = 150;
    char[][] gameField = new char[dimension][dimension];
    private GameButton[] gameButtons;
    static char nullSymbol = '\u0000';

    private Game game;

    public GameBoard(Game game){
        this.game = game;
        initField();
    }

    private void initField(){
        setBounds(cellSize * dimension, cellSize * dimension, 400,300);
        setTitle("TicTacToe");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        setLayout(new BorderLayout());

        JPanel controlPanel = new JPanel();
        JButton newGameButton = new JButton("New game");
        newGameButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                emptyField();
            }
        });

        controlPanel.setLayout(new BoxLayout(controlPanel, BoxLayout.Y_AXIS));
        controlPanel.add(newGameButton);
        controlPanel.setSize(cellSize * dimension, 150);

        JPanel gameFieldPanel = new JPanel();
        gameFieldPanel.setLayout(new GridLayout(dimension, dimension));
        gameFieldPanel.setSize(cellSize*dimension, cellSize*dimension);

        gameField = new char[dimension][dimension];
        gameButtons = new GameButton[dimension * dimension];

        for (int i = 0; i < dimension * dimension; i++){
            GameButton fieldButton = new GameButton(i, this);
            gameFieldPanel.add(fieldButton);
            gameButtons[i] = fieldButton;
        }

        getContentPane().add(controlPanel, BorderLayout.NORTH);
        getContentPane().add(gameFieldPanel, BorderLayout.CENTER);

        setVisible(true);
    }

    void emptyField(){
        for (int i = 0; i < dimension * dimension; i++){
            gameButtons[i].setText("");

            int x = i/dimension;
            int y = i%dimension;

            gameField[x][y] = nullSymbol;
        }
    }

    Game getGame(){return this.game;}

    boolean isTurnable(int x, int y){
        boolean result = false;
        if (gameField[x][y] == nullSymbol) {
            result = true;
        }
        return result;
    }

    void updateGameField(int x, int y){
        gameField[x][y] = game.getPlayer().getPlayerSign();

        if (checkWin()){
            getGame().showMessage(Character.toString(getGame().getPlayer().getPlayerSign()) + " 've won!");
            emptyField();
        }

        if (isFull()){
            getGame().showMessage("It'a a tight game");
            emptyField();
        }

    }

    boolean checkWin(){
        boolean result = false;
        char playerSymbol = game.getPlayer().getPlayerSign();
        if (checkLines() || checkDiagonals()){
            result = true;
        }
        return result;
    }

    public GameButton getButton(int buttonIndex){
        return gameButtons[buttonIndex];
    }

    boolean checkLines(){
        char playerSymbol = game.getPlayer().getPlayerSign();
        boolean result = false;
        for (int i = 0; i < dimension; i++){
            for (int j = 0; j < dimension; j++){
                if (gameField[i][j] != playerSymbol){
                    break;
                }
                if (j == dimension - 1){
                    result = true;
                }
            }
        }
        // Проверяем столбцы
        for (int i = 0; i < dimension; i++){
            for (int j = 0; j < dimension; j++){
                if (gameField[j][i] != playerSymbol){
                    break;
                }
                if (j == dimension - 1){
                    result = true;
                }
            }
        }
        return result;
    }

    boolean checkDiagonals(){
        char playerSymbol = game.getPlayer().getPlayerSign();
        boolean result = false;
        for (int i = 0; i < dimension; i++) {
            if (gameField[i][i] != playerSymbol) {
                break;
            }
            if (i == dimension - 1) {
                result = true;
            }
        }

        for (int i = dimension - 1; i >= 0; i--) {
            if (gameField[i][dimension - 1 - i] != playerSymbol) {
                break;
            }
            if (i == 0) {
                result = true;
            }
        }
        return result;
    }

    boolean isFull(){
        boolean result = true;
        outter_loop: for (int i = 0; i < dimension; i++){
            for (int j = 0; j < dimension; j++){
                if (gameField[i][j] == nullSymbol){
                    result = false;
                    break outter_loop;
                }
            }
        }
        return result;
    }

    boolean isEmpty(){
        boolean result = true;
        outter_loop: for (int i = 0; i < dimension; i++){
            for (int j = 0; j < dimension; j++){
                if (gameField[i][j] != nullSymbol){
                    result = false;
                    break outter_loop;
                }
            }
        }
        return result;
    }

    int cellScore(int x, int y){
        int score = 0;
        for (int k = - 1; k < 2; k++){
            for (int m = -1; m < 2; m++){
                if (validCell(x+k, y+m)){
                    if (gameField[x+k][y+m] == 'O'){
                        score +=1;
                    }
                }
            }
        }
        return score;
    }

    boolean validCell(int x, int y){
        boolean result = false;
        if (!(x < 0 || y < 0 || x >= dimension || y >= dimension)){
            result = true;
        }
        return result;
    }
}
