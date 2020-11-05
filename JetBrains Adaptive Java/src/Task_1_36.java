/* In the Bioinformatics Institute a competition is held between the computer science and biology students.
 The winners will get a large and tasty pie. The team of biology students consists of aa students,
 computer science team — bb students.

It is necessary to pre-cut the pie so that it would be possible to distribute the pieces of the pie to any
team that won the competition, with each member of this team should get the same number of pieces of the pie. And since you do not want to cut the pie into the too many small pieces, you need to find the minimum suitable number.

Write a program, which helps to find this number.

The program gets the size of the teams (two positive integers aa and bb, each number
is entered in a separate line) and should output the smallest number dd, which is divisible by both numbers
without remainder.

*/

import java.util.Scanner;

public class Task_1_36 {
    public static void main(String[] args) {
        int a,b;
        Scanner userInput= new Scanner(System.in);
        a = userInput.nextInt();
        b = userInput.nextInt();
        System.out.println(a*b/ecd(a,b));
    }

    public static int ecd(int a, int b){
        if (a == 0){
            return b;
        }
        else if (b == 0){
            return a;
        }
        else if (a > b){
            a %= b;
            return ecd(a,b);
        }
        else{
            b %= a;
            return ecd (a,b);
        }
    }

}


















