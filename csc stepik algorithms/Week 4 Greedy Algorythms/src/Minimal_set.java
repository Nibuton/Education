import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;

public class Minimal_set {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        // Input
        int n = userInput.nextInt();
        ArrayList<int[]> dots = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int[] dot = new int[2];
            dot[0] = userInput.nextInt();
            dot[1] = userInput.nextInt();
            dots.add(dot);
        }

        dots.sort((o1, o2) -> Integer.compare(o2[0], o1[0]));

        ArrayList<Integer> result = new ArrayList<>();

        while(dots.size() > 0){
            int max_left = dots.get(0)[0];
            result.add(max_left);
            dots.removeIf(o -> (o[1] >= max_left) || (o[0] == max_left));
        }

        System.out.println(result.size());
        printArray(result);

    }

    public static void printArray(ArrayList<Integer> arr) {
        for (int a : arr) {
            System.out.print(a + " ");
        }
    }

}

