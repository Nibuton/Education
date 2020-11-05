public class Task_1 {
    public static void main(String[] args) {
        int[] arr = {1, 0, 0, 1, 1, 0, 1};
        oneToNUll(arr);
        printArr(arr);
    }

    public static int[] oneToNUll(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
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
