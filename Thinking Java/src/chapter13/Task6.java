package chapter13;

public class Task6 {
    private int counter = 0;
    private long id = counter++;
    private float floatNumber = .67f;
    private double doubleNumber = .345;

    @Override
    public String toString() {
        return String.format("int: %d, id: %d, float: %f, double: %e", counter, id, floatNumber, doubleNumber);
    }

    public static void main(String[] args) {
        Task6 task6 = new Task6();
        System.out.println(task6);
    }
}
