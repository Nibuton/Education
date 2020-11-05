/*
Given a string. Find whether it is a palindrome, i.e. it reads the same both
left-to-right and right-to-left. Output “yes” if the string is a palindrome and “no” otherwise.
 */
import java.util.Scanner;

public class Task_1_58 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        if (s.equals(new StringBuilder(s).reverse().toString())){
            System.out.println("yes");
        }
        else {
            System.out.println("no");
        }
    }
}
