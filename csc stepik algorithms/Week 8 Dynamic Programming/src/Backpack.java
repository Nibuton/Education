import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Backpack {
    public static void main(String[] args) {
        //try(BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(new File("input.txt"))))){
        try(BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))){
            String[] wn = bufferedReader.readLine().split(" ");
            int W = Integer.parseInt(wn[0]);
            int n = Integer.parseInt(wn[1]);
            int[] gold = Arrays.stream(bufferedReader.readLine().split(" ")).mapToInt(Integer :: parseInt).toArray();
            System.out.println(maxWeight(W,n,gold));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static int maxWeight(int W, final int n, int[] gold){

        int newW = W + 1;
        int newN = n + 1;
        int[] curr = new int[newW];
        int[] prev = new int[newW];

        for (int i = 0; i < newW; i++){
            prev[i] = 0;
        }

        for (int i = 1; i < newN; i++){ // для всех предметов, кроме нулевого
            for (int j = 0; j < newW; j++){ // j по фатку и есть вместимость рюкзака
                if (j == 0){
                    curr[j] = 0;
                }
                curr[j] = prev[j];
                if (gold[i-1] <= j){
                    curr[j] = Math.max(prev[j], prev[j - gold[i-1]] + gold[i-1]);
                }
            }
            prev = Arrays.copyOf(curr, curr.length);
        }
        return curr[newW - 1];
    }
}
