import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {
    public static void main(String[] args) throws IOException {
       /* BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String numbers;
        while ((numbers = bufferedReader.readLine()) != null){
            String[] split = numbers.split("[^A-Za-z0-9]+");
            System.out.println(split.length);
            for (String word : split){
                System.out.println(word);
            }
        }
        bufferedReader.close();*/
        Map<String, List<Integer>> map = new HashMap<>();
        map.get("abc");
    }
}
