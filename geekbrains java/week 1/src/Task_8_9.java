import java.util.Scanner;

/* Задача номер 9
Думаю, это перегрузка метода (т.е. имеется ввиду сигнатуа). Парметры передаеются в
разном порядке, поэтому при вызове java выберет ту сигнатуру, где соответсвующий порядок
передаваемых парметров
 */

public class Task_8_9 {
    public static void main(String[] args) {
        int year = ReadIntArgument();
        String answer = YearCheck(year);
        System.out.println(answer);
    }

    static String YearCheck(int year) {
        if (( year % 4 != 0 || year == 100 ) && year % 400 != 0){
            return "Year " + year +" isn't leap";
        }
        return "Year " + year +" is leap";
    }

    static int ReadIntArgument() {
        Scanner UserInput = new Scanner(System.in);
        System.out.println("Insert year");
        int argument = UserInput.nextInt();
        return argument;
    }

}
