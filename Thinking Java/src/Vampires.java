import java.util.*;

public class Vampires {
    public static void main(String[] args) {
        String[] s = new String[4];

        for(int i = 10; i < 100; i++){
            for (int j = 10; j < 100; j++){
                int num = i * j;
                if (i*j / 1000 > 0) {
                    Set<String> set1 = new HashSet<>(Arrays.asList((Integer.toString(i) + Integer.toString(j)).split("")));
                    Set<String> set2 = new HashSet<>(Arrays.asList((Integer.toString(num).split(""))));
                    if (set1.equals(set2)) {
                        System.out.println(num);
                    }
                }
            }
        }
    }
}
