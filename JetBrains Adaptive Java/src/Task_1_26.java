/* You are given coordinates of two queens on a chess board. Find out, whether they hit each other or not.
Type "YES" (uppercase) if they hit each other or "NO" if the don't.

The same problem 1.164
*/

import java.util.Scanner;

import static java.lang.Math.abs;

public class Task_1_26 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int x1, x2, y1, y2;
        x1 = userInput.nextInt();
        x2 = userInput.nextInt();
        y1 = userInput.nextInt();
        y2 = userInput.nextInt();
        String answer = coCh(x1,x2,y1,y2);
        System.out.println(answer);
    }

    public static String coCh(int x1, int y1, int x2, int y2){
        String result = "NO";
        if (x1 == x2 || y1 == y2){
            result = "YES";
        }
        else if(abs(x1 - x2) == abs (y1 - y2)){
            result = "YES";
        }
        return result;
    }
}
