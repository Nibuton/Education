import java.util.function.DoubleUnaryOperator;

public class SquareIntegrate {
    public static void main(String[] args) {

        DoubleUnaryOperator f = x -> {return x*x;};
        System.out.println(integrate(f,0,10));

    }

    public static double integrate(DoubleUnaryOperator f, double a, double b) {
        double h = 10e-8;
        double sum = 0;
        while (a <= b){
            sum += f.applyAsDouble(a) * h;
            a +=h;
        }
        return sum;
    }

}
