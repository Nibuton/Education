/*

The map is given.

Output each its key-value pair in the loop with a new line.

Each line must be in form of key=value (for example, Gamma=3)

 */

import java.util.*;

public class Task_3_115{

    public static void main(String[] args) {


        Map<String, Integer> map = new TreeMap<>();
        map.put("Gamma",  3);
        map.put("Omega", 24);
        map.put("Alpha",  1);

        for ( Map.Entry<String, Integer> item : map.entrySet()){
            System.out.println(item.getKey() + "=" + item.getValue());
        }

    }
}
