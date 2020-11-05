import java.util.ArrayList;
import java.util.Scanner;

public class K_slagaemih {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int n = userInput.nextInt();
        int sum = 0;
        int num = 1;
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < n; i++){
            if (n == 1){
                System.out.println(1);
                System.out.println(1);
                break;
            }
            if (n-sum < 2 * num + 1){
                num = n - sum;
                numbers.add(num);
                System.out.println(i+1);
                break;
            }
            numbers.add(num);
            sum += num;
            num++;
        }
        Output(numbers);
    }

    public static void Output(ArrayList<Integer> arr){
        for (int i = 0; i < arr.size(); i++){
            System.out.print(arr.get(i) + " ");
        }
    }
}
