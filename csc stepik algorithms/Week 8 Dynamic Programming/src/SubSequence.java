import java.util.Arrays;
import java.util.Scanner;
import java.util.function.BiPredicate;

public class SubSequence{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++){
            A[i] = scanner.nextInt();
        }
        // System.out.println(subsequence(A, (a,b) -> (a%b == 0)));
        subsequence(A, (a,b) -> (a<=b));
    }

    public static void subsequence(int[] A, BiPredicate <Integer, Integer> predicate){
        int n = A.length;
        int[] D = new int[n];
        int k = 1;
        StringBuilder answer = new StringBuilder("");
        for (int i = 0; i < n; i++) {
            D[i] = 1;
            for (int j = 0; j < i; j++) {
                if (predicate.test(A[i], A[j]) && (D[j] + 1 > D[i])) {
                    D[i] = D[j] + 1;
                }
            }
        }
        int max = Arrays.stream(D).max().getAsInt();

        System.out.println(max);

        int j = n - 1;

        while(D[j] != max){
            j--;
        }

        max--;

        answer.append((j + 1) + " ");

        for (int i = j - 1; i >= 0; i--){

            if ((D[i] == max) && predicate.test(A[j], A[i])){
                max--;
                answer.insert(0, (i + 1) + " ");
                j = i;
            }
        }

        System.out.println(answer);
    }

    public static void printArray(int[] A){
        for (int a : A){
            // System.out.print(a + " ");
            System.out.print((a+1) + " "); // +1 только по условию задачи
        }
    }
}


