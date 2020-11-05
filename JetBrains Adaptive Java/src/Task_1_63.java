/* Write a program that finds all occurrences of the given substring in the string.
* Output format:
A single line with the indices (indexing starts with zero) of the occurrences of the given
* substring in the string, separated by a space, or number -1 when the substring is absent.
*/

// Реализовал, как понял, алгоритм Knuth–Morris–Pratt algorithm
import java.util.ArrayList;
import java.util.Scanner;

class Task_1_63 {

    public static void main(String[] args) {
        String str;
        String needle;
        Scanner userInput = new Scanner(System.in);
        str = userInput.next();
        needle = userInput.next();
        // int counter = 0;
        ArrayList<Integer> indexes = new ArrayList<Integer>();
        for (int i = 0; i < str.length() - needle.length() + 1; i++) {
            for(int j = 0; j < needle.length(); j++){
                if (str.charAt(i+j) != needle.charAt(j)){
                    if (j > 1){
                        i+=j-1;
                    }
                    break;
                }
                if (j == needle.length()-1){
                    indexes.add(i);
                }
            }
        }
        if (indexes.size() == 0){
            System.out.println(-1);
        }
        else {
            for (int i = 0; i < indexes.size(); i++) {
                System.out.print(indexes.get(i) + " ");
            }
        }
    }
}

