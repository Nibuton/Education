import java.util.Arrays;
import java.util.Scanner;

public class Levenstein {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String original = scanner.next();
        String target = scanner.next();

        System.out.println(lev(original, target));

    }

    public static int lev(String original, String target){

        int originalSize = original.length() + 1;
        int targetSize = target.length() + 1;

        int[] prev = new int[originalSize];
        int[] curr = new int[originalSize];

        for (int i = 0; i < originalSize; i++){
            prev[i] = i;
        }

        // printArray(prev);

        for (int j = 1; j < targetSize; j++){
            for (int i = 0; i < originalSize; i++){
                if (i == 0){
                    curr[i] = j;
                }
                else {
                    int c = charsAreEqual(original.charAt(i-1), target.charAt(j-1));
                    // System.out.println("i: " + i + " prev[i - 1] " + prev[i-1]);
                    // printArray(prev);
                    curr[i] = Math.min(Math.min(prev[i] + 1, curr[i - 1] + 1), prev[i - 1] + c);
                }
            }
            prev = Arrays.copyOf(curr, curr.length);
            //printArray(prev);
        }

        return curr[originalSize - 1];
    }

    public static int charsAreEqual(char a, char b){
        return a == b ? 0 : 1;
    }

    public static void printArray(int[] a){
        for (int e : a){
            System.out.print(e + " ");
        }
        System.out.println();
        return;
    }
}
