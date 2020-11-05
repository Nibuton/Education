import java.util.HashSet;
import java.util.Set;

public class Sets {

    public static <T> Set<T> symmetricDifference(Set<? extends T> set1, Set<? extends T> set2) {
        Set<T> intersection = new HashSet<>();
        Set<T> union = new HashSet<>();
        Set<T> symDifference = new HashSet<>();
        for (T a : set1){
            if (set2.contains(a)){
                intersection.add(a);
            }
        }
        union.addAll(set1);
        union.addAll(set2);
        for (T a: union){
            if (!intersection.contains(a)){
                symDifference.add(a);
            }
        }
        return symDifference;

    }
}
