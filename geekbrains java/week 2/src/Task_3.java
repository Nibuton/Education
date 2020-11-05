public class Task_3 {
    public static void main(String[] args) {
        int[] arr =  {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        multiplication(arr);
        printArr(arr);
    }

    public static int[] multiplication(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < 6){
                arr[i]*=2;
            }
        }
        return arr;
    }

    public static void printArr(int arr[]) {
        for (int a: arr){
            System.out.println(a);
        }
    }
}