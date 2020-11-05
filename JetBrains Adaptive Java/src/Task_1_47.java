/*
On the input, the program gets a sequence of non-negative integers; each integer is written in a separate line. The sequence ends with an integer 0, when reading which the program should end its work and output the length of the sequence (not counting the final 0).

Don’t read numbers following the number 0.
 */
import java.util.*;
public class Task_1_47 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cnt = 0;
        while(scanner.nextInt() != 0){
            cnt++;
        }
        System.out.print(cnt);
    }
}
