import java.util.Scanner;

/*
Digital watches

Digital watches display time in the h:mm:ss format (from 0:00:00 to 23:59:59), i.e. first goes the number of hours, then goes the two-digit number of minutes, followed by the two-digit number of seconds. If necessary, number of minutes and seconds are filled by zeroes to a two-digit number.

N seconds passed from the beginning of the day. Output what the watches will display.

Input data format

Given the natural number N on input, not exceeding 10^7
 */
public class Task_1_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int seconds = n % 60;
        n = n - seconds;
        int minutes = (n / 60) % 60;
        n = n - 60 * minutes;
        int hours = (n / (60*60)) % 24;
        String answer = hours + ":" + makeNumber(minutes) + ":" + makeNumber(seconds);
        System.out.println(answer);
    }

    public static String makeNumber(int n){
        String s = String.valueOf(n);
        if (s.length() < 2){
            s = "0" + s;
        }
        return s;
    }
}
