public class Task_6 {
    public static void main(String[] args) {
        int [] arr1 = {1, 1, 1, 2, 1};
        int [] arr2 = {2, 1, 1, 2, 1};
        int [] arr3 = {10,10};
        printAnswer(arr1);
        System.out.println();
        printAnswer(arr2);
        System.out.println();
        printAnswer(arr3);
    }
    public static int arraySum(int[] arr){
        int sum = 0;
        for(int a: arr){
            sum+=a;
        }
        return sum;
    }
    public static boolean CheckBalance(int[] arr){
        int sum = arraySum(arr);
        int partial_sum = 0;
        boolean answer = false;
        for (int a: arr){
            partial_sum += a;
            if (partial_sum == sum - partial_sum){
                answer = true;
                break;
            }
        }
        return answer;
    }

    public static void printAnswer(int[] arr){
        boolean answer = CheckBalance(arr);
        System.out.println(answer);
    }
}
