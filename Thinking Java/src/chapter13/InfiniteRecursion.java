package chapter13;

public class InfiniteRecursion {

    @Override
    public String toString() {
        return super.toString() + "abc";
    }

    public static void main(String[] args) {
        System.out.println(new InfiniteRecursion());
    }
}
