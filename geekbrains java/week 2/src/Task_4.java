public class Task_4 {
    public static void main(String[] args) {
        int[][] arr =  new int[5][5];
        diag(arr);
        printArr(arr);
    }

    public static int[][] diag(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            arr[i][i] = 1;
        }
        return arr;
    }

    public static void printArr(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}
