import java.util.*;

public class Load_manager {
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);
        ArrayDeque<Integer> queue1 = new ArrayDeque<Integer>();
        ArrayDeque<Integer> queue2 = new ArrayDeque<Integer>();
        int sum1 = 0;
        int sum2 = 0;
        int n = scanner.nextInt();
        for (int i = 0; i < n;i++ ){
            if (sum1 <= sum2){
                queue1.addLast(scanner.nextInt());
                sum1+= scanner.nextInt();
            }
            else{
                queue2.addLast(scanner.nextInt());
                sum2+= scanner.nextInt();
            }
        }
        printQueue(queue1);
        printQueue(queue2);
    }

    public static void printQueue(ArrayDeque<Integer> queue){
        for (int q: queue){
            System.out.print(q + " ");
        }
        System.out.println();
    }
}