import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Swap {
    /* public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        List<Integer> list = new ArrayList<>();
        String line = scanner.nextLine();
        String[] s = line.split(" ");
        for (String c : s){
            list.add(Integer.parseInt(c));
        }
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++){
            int j = scanner.nextInt();
            int k = scanner.nextInt();
            Collections.swap(list, j, k);
        }
        for (int i: list){
            System.out.print(i + " ");
        }
    }*/
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int row = input.nextInt();
        int col = input.nextInt();
        List<String> rows = new ArrayList<>();
        input.nextLine();
        for (int i = 0; i < row; i++){
            rows.add(input.nextLine());
        }
        int dist = input.nextInt();
        Collections.rotate(rows, dist);
        for (String s: rows){
            System.out.println(s);
        }
    }
}

/*
1 2 3 4 5 6
2
0 1
3 4
 */