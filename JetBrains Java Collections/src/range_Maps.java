import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class range_Maps {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        Scanner input = new Scanner(System.in);
        int left = input.nextInt();
        int right = input.nextInt();
        int n = input.nextInt();
        int key;
        String value;
        for (int i = 0; i < n; i++){
            key = input.nextInt();
            value = input.next();
            if (key >= left && key <= right){
                map.put(key,value);
            }
        }
        for (Map.Entry<Integer, String> e : map.entrySet()){
            System.out.println(e.getKey() + " " + e.getValue());
        }
    }
}
