/*
Write a program that prints a part of the sequence 1 2 2 3 3 3 4 4 4 4 5 5 5 5 5 ... (the number is repeated as many times, to what it equals to). Input to the program is a positive integer n – the number of the elements of the sequence the program should print. On the output, it is expected to get the sequence of numbers, written in a single line, space-separated.

For example, if n = 7, then the program should output 1 2 2 3 3 3 4.
 */
import java.util.Scanner;

public class Task_1_49 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; n > 0; i++){
           for (int j = 0; j < i; j++){
               System.out.print(i + " ");
               n--;
               if (n == 0){
                   break;
               }
            }
        }
    }
}
