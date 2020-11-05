import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Для задачи про дженерики
        /*
         Pair<Integer, String> pair = Pair.of(1, "hello");
        Integer i = pair.getFirst(); // 1
        String s = pair.getSecond(); // "hello"

        Pair<Integer, String> pair2 = Pair.of(1, "hello");
        boolean mustBeTrue = pair.equals(pair2); // true!
        boolean mustAlsoBeTrue = pair.hashCode() == pair2.hashCode(); // true!

        System.out.println(i);
        System.out.println(s);
        System.out.println(mustBeTrue);
        System.out.println(mustAlsoBeTrue);
         */
        Integer[] array1 = {4,2,3};
        Integer[] array2 = {2,3,1};
        Set<Integer> set1 = new HashSet<>(Arrays.asList(array1));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(array2));

        Set<Integer> set3 = Sets.symmetricDifference(set1, set2);
        System.out.println(set3);

    }
}
