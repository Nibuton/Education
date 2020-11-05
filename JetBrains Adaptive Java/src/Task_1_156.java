/*
Найти такое максимальное число, что 2 в стпени это число не превосходит заданное число
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task_1_156 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        List<Integer> answer = new ArrayList<Integer>();
        int num = 0;
        for (int i = 0; i < T; i++){
            num = scanner.nextInt();
            answer.add(solution(num));
        }
        for (int a : answer){
            System.out.println(a);
        }
    }

    public static int solution(int n){
        int counter = 0;
        while (n != 1){
            n = (int) Math.floor(n/2);
            counter ++;
        }
        return counter;
    }
}
