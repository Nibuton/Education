import java.util.HashMap;
import java.util.Scanner;

public class PrimitiveCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        System.out.println(minSteps(k)[k-1]);
        for (int i : restoreAnswer(minSteps(k))){
            System.out.print(i + " ");
        }
    }

    public static int[] minSteps(int k){
        int[] optimum = new int[k];
        optimum[0] = 0;
        if (k < 4){
            if (k == 1) {
                return optimum;
            }
            for (int i = 1; i < k; i++){
                optimum[i] = 1;
            }
            return optimum;
        }

        optimum[1] = 1;
        optimum[2] = 1;
        boolean n2 = false;
        boolean n3 = false;

        for (int i = 3; i < k; i++){
            int j = i + 1;
            n2 = j % 2 == 0;
            n3 = j % 3 == 0;
            if (n2 && n3){
                optimum[i] = Math.min(optimum[i-1], Math.min(optimum[j/2 - 1], optimum[j/3 -1])) + 1;
            }
            else if (n2){
                optimum[i] = Math.min(optimum[i-1], optimum[j/2 - 1]) + 1;
            }
            else if (n3){
                optimum[i] = Math.min(optimum[i-1], optimum[j/3 - 1]) + 1;
            }
            else{
                optimum[i] = optimum[i-1] + 1;
            }
        }
        return optimum; // answer in optimum[k-1]
    }

    public static int[] restoreAnswer(int[] optimum){

        int curr = optimum.length;
        int numOfOperations = optimum[curr - 1];

        int[] answer = new int[numOfOperations + 1];
        boolean n2 = false;
        boolean n3 = false;

        while(numOfOperations > 0){

            /*if (curr < 3){
                break;
            }*/

           // System.out.println("I write in answer " + curr);

            answer[numOfOperations] = curr;

            n2  = curr % 2 == 0;
            n3 = curr % 3 == 0;

            if (optimum[curr - 1 - 1] == numOfOperations - 1){
                curr--;
               // System.out.println("I'm in first section, i make curr = " + curr);
            }
            else if (n2 && optimum[curr/2 - 1] == numOfOperations - 1){
                curr = curr / 2;
               // System.out.println("I'm in second section, i make curr = " + curr);
            }
            else{
                curr = curr / 3;
               // System.out.println("I'm in third section, i make curr = " + curr);
            }
            numOfOperations--;
        }
        answer[0] = 1;
        return answer;
    }
}
