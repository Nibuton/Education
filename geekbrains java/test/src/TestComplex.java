public class TestComplex {
    public static void main(String[] args) {
        ComplexNumber a = new ComplexNumber(1.1,2);
        ComplexNumber b = new ComplexNumber(1,2);
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
    }
}
