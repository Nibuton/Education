public class Task_2 {
    public static void main(String[] args) {
        int[] arr = new int[8];
        everyThird(arr);
        printArr(arr);
    }

    public static int[] everyThird(int arr[]) {
        for (int i = 0, j = 0; j < arr.length; i+=3, j++) {
            arr[j] = i;
        }
        return arr;
    }

    public static void printArr(int arr[]) {
        for (int a: arr){
            System.out.println(a);
        }
    }
}