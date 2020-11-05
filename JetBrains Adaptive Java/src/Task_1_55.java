/*
GC-content is an important feature of the genome sequences and is defined as the percentage ratio of the sum of all guanines and cytosines to the overall number of nucleic bases in the genome sequence.
Write a program, which calculates the percentage of G characters (guanine) and C characters (cytosine) in the entered string. Your program should be case independent.

For example, in the string "acggtgttat" the percentage of characters G and C equals to \dfrac4{10} \cdot 100 = 40.0
10
4
​
 ⋅100=40.0, where 4 is the number of symbols G and C, and 10 is the length of the string.

Output your result as a double value.
 */

import java.lang.reflect.Array;
import java.util.*;

public class Task_1_55 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String line = input.next();
        List<String> list = new ArrayList<String>(Arrays.asList(line.toLowerCase().split("")));
        double answer = 0;
        if (line.length() != 0){
            double c = Collections.frequency(list,"c");
            double g = Collections.frequency(list, "g");
            double l = line.length();
            answer = (c + g)*100/l;
        }
        System.out.println(answer);
    }
}
