/*
The roots of equation

Given the numbers a, b, c, da,b,c,d. Output in ascending order all the integers between 0 and 1000, which are the roots of the equation ax^3+bx^2+cx+d=0ax
3
 +bx
2
 +cx+d=0.

If the specified interval does not contain the roots of the equation, do not output anything.
 */
import java.util.*;
public class Task_1_35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int counter = 0;
        for (int i = 0; i <= 1000; i++){
            if (a*i*i*i + b * i * i + c * i + d == 0){
                System.out.println(i);
                counter++;
            }
            if (counter == 3){
                break;
            }
        }
    }

}
