/*
Given a three-digit integer (i.e. an integer from 100 to 999). Find the sum of its digits.
 */

import java.util.Scanner;

public class Task_1_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a  = scanner.nextInt();
        System.out.println(rec(a,3));
    }

    public static int rec(int n, int d){
        int counter = 0;
        int div = (int) Math.pow(10.0, (double) d);
        int num = 0;
        while(div >= 1) {
            num = n / div;
            counter += num;
            n = n - num * div;
            div /= 10;
        }
        return counter;
    }
}
