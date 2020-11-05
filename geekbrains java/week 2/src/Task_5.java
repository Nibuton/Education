public class Task_5 {
    public static void main(String[] args) {
        int[] arr = {189,2,100,4,5,7,-5,-14,0};
        minMax(arr);
    }

    public static void minMax(int arr[]) {
        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            else if (arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("Min element = " + min +"\n" + "Max element = " + max);
    }

}