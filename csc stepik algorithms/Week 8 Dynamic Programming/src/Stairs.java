/*
На каждую конкретную ступеньку можно попасть только с предыдущей или с предпоследней перед ней.
Значит, в набор воходят либо обе эти стпеньки, либо одна из них. Если выкинуть последнюю или две
последних ступеньки из оптимального решения, то должен остаться оптимальный набор ступенек.
 */
import java.util.Scanner;

public class Stairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] steps = new int[n];
        for (int i = 0; i < n; i++){
            steps[i] = scanner.nextInt();
        }
        System.out.println(maxSumSteps(steps, n));
    }

    public static int maxSumSteps(final int[] steps, final int n){
        int[] optimalsteps = new int[n+1];

        optimalsteps[0] = 0;
        optimalsteps[1] = steps[0];

        for(int i = 2; i < n+1; i++){
            optimalsteps[i] = steps[i-1] + Math.max(optimalsteps[i-1], optimalsteps[i-2]);
        }

        return  optimalsteps[n];
    }
}
