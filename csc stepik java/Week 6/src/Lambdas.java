import java.util.*;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class Lambdas {
    public static void main(String[] args) {
        String test = "dlns ldfln ds";
        Function<String, String> f = (s) -> Arrays.stream(s.split(" ")).map(String::toUpperCase).reduce(String::concat).get();
        System.out.println(f.apply(test));
        BiFunction<Long, Long, Long> f2 = (left, right) -> LongStream.rangeClosed(left, right).reduce((a,b) -> a*b).getAsLong();
        System.out.println(f2.apply(5L,15L));
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("b");
        list.stream().collect(Collectors.toSet()).forEach((x) -> System.out.print(x + " "));
        a -> a.stream().collect(Collectors.toSet()).forEach((x) -> System.out.print(x + " "));





    }
}
