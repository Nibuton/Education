import java.util.Scanner;
import java.util.Random;

public class TicTacToe {

   private static final char DOT_X = 'X';
   private static final char DOT_O = 'O';
   private static final char DOT_EMPTY = '*';
   private static Scanner scanner = new Scanner(System.in);
   private static Random random = new Random();

   private static char[][] MAP;
   private static int SIZE;
   private static int SILLY = 3; // Если 1 - Компьютер будет играть глупой тактикой
    // Если 2 тактикой с выбором клетки по приницпу есть/нет соседняя своя
   // Иначе будет играть по тактике с проставлением оценки клетке

    public static void main(String[] args) {

        while (true) {
            gameSession();
            if (!playAgain()) {
                break;
            }
        }
    }

    // Метод, принимающий от пользователя настройки поля

    private static void getSettings(){
        System.out.println("Hello! Let's play TicTacToe! :)\nPlease, enter size of the field more or equal to 3: ");
        do{
            SIZE = scanner.nextInt();
        } while(!sizeIsValid(SIZE));
    }

    // Метод, который определяет, допустимый ли размер поля ввел пользователь

    private static boolean sizeIsValid(int s){
        boolean ret = true;
        if (s < 3){
            System.out.println("Sorry, but we can't play on such a field. Please, reenter size of the field more or equal to 3: ");
            ret = false;
        }
        return ret;
    }

    // Метод, определяющий хочет ли пользователь сыграть еще раз

    private static boolean playAgain(){
        int c;
        boolean ret = false;
        while(true) {
            System.out.println("Want to play Again? [1/0]");
            c = scanner.nextInt();
            if (c == 1){
                ret = true;
                break;
            }
            if (c == 0){
                ret = false;
                break;
            }
            System.out.println("Please, answer with [1/0]");
        }
        return ret;
    }

    // Метод, полностью отвечающий за проведение одной игровой сессии

    private static void gameSession() {

        getSettings();
        initMap();
        printMap();

        while (true) {

            humanTurn();
            if (isEnd(DOT_X)) {
                break;
            }

            computerTurn();
            if (isEnd(DOT_O)){
                break;
            }

        }
        System.out.println("Game over");
    }

    // Инициализация карты

    private static void initMap(){
        MAP = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++){
            for (int j =0; j < SIZE; j++){
                MAP[i][j] = DOT_EMPTY;
            }
        }
    }

    // Вывод карты

    private static void printMap(){
        System.out.print("  ");
        for (int i = 0; i < SIZE; i++){
            System.out.print(i+1 + " ");
        }
        for (int i = 0; i < SIZE; i++){
            System.out.println();
            System.out.print(i+1 + " ");
            for (int j =0; j < SIZE; j++){
                System.out.print(MAP[i][j] + " ");
            }
        }
        System.out.println();
    }

    // Метод вносящий изменения в карту

    private static void updateMap(char sign, int x, int y){
        MAP[x-1][y-1] = sign;
    }

    // Метод, управляющий ходом пользователя

    private static void humanTurn(){
        int x,y;
        do {
            System.out.println("Insert row coordinate: ");
            x = scanner.nextInt();
            System.out.println("Insert column coordinate: ");
            y = scanner.nextInt();
            if (!coordIsValid(x,y)){
                System.out.println("Invalid input. Please, reinsert coordinates");
                System.out.println();
            }
            else if (!cellIsAvailable(x,y)){
                System.out.println("This cell is not empty. Please, reinsert coordinates");
                System.out.println();
            }
        } while(!coordIsValid(x,y) || !cellIsAvailable(x,y));
        updateMap(DOT_X,x,y);
    }

    // Метод, управляющий ходом компьютера

    private static void computerTurn(){
        int x = -1;
        int y = -1;
        int max_score = 0;
        if (SILLY == 1) {
            do {
                x = random.nextInt(SIZE) + 1;
                y = random.nextInt(SIZE) + 1;
            } while (!cellIsAvailable(x, y));
        }
        else if (SILLY == 2) {
            outter_loop: for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++) {
                    if (cellIsAvailable(i+1,j+1)){
                        if (cellNearby(i+1, j+1)){
                            x = i+1;
                            y = j+1;
                            break outter_loop;
                        }
                    }
                }
            }
            if (x == -1){
                do {
                    x = random.nextInt(SIZE) + 1;
                    y = random.nextInt(SIZE) + 1;
                } while (!cellIsAvailable(x, y));
            }
        }
        else {
            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++) {
                    int current_score = 0;
                    if (cellIsAvailable(i + 1, j + 1)) {
                        current_score = cellScore(i + 1, j + 1);
                    }
                    if (current_score >= max_score) {
                        x = i + 1;
                        y = j + 1;
                        max_score = current_score;
                    }
                }
            }
        }
        System.out.println("Computer went to " + x + " " + y);
        updateMap(DOT_O,x,y);
    }

    // Метод для вычисления балла клетки

    private static boolean cellNearby(int x, int y){
        boolean ret = false;
        out_loop: for (int k = - 1; k < 2; k++){
            for (int m = -1; m < 2; m++){
                if (coordIsValid(x+k,y+m)){
                    if (MAP[x+k-1][y+m-1] == DOT_O){
                        ret = true;
                        break out_loop;
                    }
                }
            }
        }
    return ret;
    }

    private static int cellScore(int x, int y){
        int score = 0;
        for (int k = - 1; k < 2; k++){
            for (int m = -1; m < 2; m++){
                if (coordIsValid(x+k,y+m)){
                    if (MAP[x+k-1][y+m-1] == DOT_O){
                        score +=1;
                    }
                }
            }
        }
        return score;
    }

    // Метод, проверящий валидна ли координата, введенная пользователем

    private static boolean coordIsValid(int x, int y){
        boolean ret = true;
        if ( x > SIZE || y > SIZE || x <= 0 || y <= 0){
            ret = false;
        }
        return ret;
    }

    // Метод, поверяющий не занята ли клетка

    private static boolean cellIsAvailable(int x, int y){
        boolean ret = true;
        if (MAP[x-1][y-1] != DOT_EMPTY){
            ret = false;
        }
        return ret;
    }

    // Метод, проверяющий условия конца игры

    private static boolean isEnd(char sign){
        boolean ret = false;
        printMap();

        if (checkWin(sign)){
            System.out.println(sign + " have won!");
            ret = true;
        }
        if (!ret){
            if (mapIsFull()){
                System.out.println("It's a tight game!");
                ret = true;
            }
        }
        return ret;
    }

    // Метод, проверяющий условия победы

    private static boolean checkWin(char sign){
        boolean ret = false;

        // Проверяем строки

        for (int i = 0; i < SIZE; i++){
            for (int j = 0; j < SIZE; j++){
                if (MAP[i][j] != sign){
                    break;
                }
                if (j == SIZE - 1){
                    ret = true;
                }
            }
        }
        // Проверяем столбцы

        for (int i = 0; i < SIZE; i++){
            for (int j = 0; j < SIZE; j++){
                if (MAP[j][i] != sign){
                    break;
                }
                if (j == SIZE - 1){
                    ret = true;
                }
            }
        }

        // Проверяем две диагонали

        for (int i = 0; i < SIZE; i++) {
            if (MAP[i][i] != sign) {
                break;
            }
            if (i == SIZE - 1) {
                ret = true;
            }
        }

        for (int i = SIZE - 1; i >= 0; i--) {
            if (MAP[i][SIZE - 1 - i] != sign) {
                break;
            }
            if (i == 0) {
                ret = true;
            }
        }
        return ret;
    }

    // Метод, проеряющий не заполнена ли карта

    private static boolean mapIsFull(){
        boolean ret = true;
        outter_loop: for (int i = 0; i < SIZE; i++){
            for (int j = 0; j < SIZE; j++){
                if (MAP[i][j] == DOT_EMPTY){
                    ret = false;
                    break outter_loop;
                }
            }
        }
        return ret;
    }

}
