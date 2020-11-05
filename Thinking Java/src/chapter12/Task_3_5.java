package chapter12;

public class Task_3_5 {

    public static void main(String[] args) {
        int[] arr = new int[5];
        int i = -2;
        while(true) {
            try {
                i++;
                arr[i] = i;
                break;
            } catch (ArrayIndexOutOfBoundsException a) {
                System.out.println("Caught at i = " + i);
                continue;
            }
        }
    }
}
