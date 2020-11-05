import java.util.ArrayList;
import java.util.Scanner;

public class Backpack {
    public static void main(String[] args) {
        Scanner userInput  = new Scanner(System.in);
        int n = userInput.nextInt();
        int W = userInput.nextInt();
        double c;
        double w;
        ArrayList<double[]> cost = new ArrayList<>();
        for(int i = 0; i < n; i++){
            c = userInput.nextDouble();
            w = userInput.nextDouble();
            cost.add(new double[]{c/w,w});
        }
        cost.sort((o1, o2) -> Double.compare(o2[0],o1[0]));
        double result = 0;
        for (int i = 0; i < n; i++){
            if (cost.get(0)[1] >= W){
                result += W*cost.get(0)[0];
                W = 0;
                break;
            }
            else{
                result += cost.get(0)[1] * cost.get(0)[0];
                W -= cost.get(0)[1];
                cost.remove(0);
            }
        }

        String res = String.format("%.3f", result).replace(',','.');
        System.out.println(res);
    }

    public static void printArray(ArrayList<double[]> arr){
        for (double[] a : arr){
            for (double b : a){
                System.out.print(b + " ");
            }
            System.out.println();
        }
    }
}
