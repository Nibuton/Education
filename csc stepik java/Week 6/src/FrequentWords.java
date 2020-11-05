import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Map.Entry.comparingByKey;
import static java.util.Map.Entry.comparingByValue;

public class FrequentWords {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in, StandardCharsets.UTF_8));
        Stream<String> stream = bufferedReader.lines();

        Comparator cmp1 = comparingByValue().reversed();
        Comparator cmp2 = comparingByKey();

        stream.flatMap(s -> Arrays.stream(s.split("[^A-Za-z0-9]+")))
                .map(String::toLowerCase)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .sorted(cmp1.thenComparing(cmp2))
                .limit(10)
                .map(o -> ((Map.Entry) o).getKey())
                .forEach(System.out :: println);
    }
}
