package chapter14;

public class Task5 {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape square = new Square();
        circle.draw();
        square.draw();
        circle.rotate(10);
        square.rotate(1000);
    }
}
