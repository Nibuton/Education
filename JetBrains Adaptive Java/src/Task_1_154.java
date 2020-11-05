/*
In the Roman numbering system, the following symbols are used to represent numbers
(on the right are the numbers, which correspond to these symbols in the decimal system):

I = 1
V = 5
X = 10
L = 50
C = 100
D = 500
M = 1000

We use an option in which the numbers 4, 9, 40, 90, 400 and 900 are represented by a subtraction of a
smaller number from a larger one: IV, IX, XL, XC, CD and CM, respectively.

Write a program that converts the number from Roman system into the decimal one.

Input format:
The string, containing the number, encoded into the Roman numbering system. It is guaranteed that
this number is less than 4000.

Output format:
The string, containing the number in the decimal numbering system, which corresponds to the input.
 */

import java.util.HashMap;
import java.util.Scanner;

public class Task_1_154 {
    public static void main(String[] args) {
        HashMap<Character, Integer> numbers = new HashMap<>();
        numbers.put('I', 1);
        numbers.put('V', 5);
        numbers.put('X', 10);
        numbers.put('L', 50);
        numbers.put('C', 100);
        numbers.put('D', 500);
        numbers.put('M', 1000);
        Scanner userInput = new Scanner(System.in);
        String rom = userInput.next();
        int answer = readNumber(rom, numbers);
        System.out.println(answer);
    }

    public static int readNumber(String rom, HashMap<Character, Integer> dict){
        int sum = 0;
        for (int i = 0; i < rom.length(); i++){
            if ( i == rom.length() - 1){
                sum+= dict.get(rom.charAt(i));
            }
            else {
                int a = dict.get(rom.charAt(i));
                int b = dict.get(rom.charAt(i + 1));
                if (a >= b) {
                    sum += a;
                } else {
                    sum += (b - a);
                    i++;
                }
            }
        }
        return sum;
    }
}
