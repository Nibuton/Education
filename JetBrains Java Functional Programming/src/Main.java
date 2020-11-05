import sun.security.pkcs11.wrapper.Functions;

import java.util.*;
import java.util.function.Function;
import java.util.stream.*;

public class Main{
    public static void main(String[] args) {
        String text = "i will f your a and you will s my d you curseWord1 a";
        List<String> badWords = Arrays.asList("curseWord1", "curseWord2", "f", "d", "a", "s", "aa");

        Stream<String> badWordsInText = createBadWordsDetectingStream(text, badWords);//!! write your solution here

        badWordsInText.collect(Collectors.toList()).forEach(System.out::println);

        System.out.println(factorial(1));

        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
        Collectors.counting()
        Map<Boolean, List<String>> map =
                badWords.stream().collect(Collectors.partitioningBy(s -> s.equals((new StringBuilder(s)).reverse().toString())));

        Collectors.groupingBy()
        for (Map.Entry<Boolean, List<String>> entry : map.entrySet()){
            System.out.print(entry.getKey() + " ");
            entry.getValue().stream().forEach(s -> System.out.print(s + " "));
            System.out.println();
        }

    }

    public static boolean isPrime(final long number) {
        return !LongStream.rangeClosed(2,number/2).anyMatch(val -> number % val == 0 && val != number);
    }

    public static Stream<String> createBadWordsDetectingStream(String text, List<String> badWords) {
         return Arrays.stream(text.split(" ")).filter(val -> badWords.contains(val)).distinct().sorted();
    }

    public static IntStream createFilteringStream(IntStream evenStream, IntStream oddStream) {
        return IntStream.concat(evenStream, oddStream).filter(val -> val % 3 == 0 && val % 5 == 0).sorted();
    }

    public static long factorial(long n) {
        return n == 0 ? 1 : LongStream.rangeClosed(1,n).reduce(1,(a,b) -> a*b);
    }



}