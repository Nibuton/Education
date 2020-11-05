public class WrongSqrt {
    public static void main(String[] args) {
        System.out.println(sqrt(-5));
    }

    public static double sqrt(double x){
        if (x < 0){
            throw new IllegalArgumentException("Expected non-negative number, got " + x);
        }
        else{
            return Math.sqrt(x);
        }
    }

}
