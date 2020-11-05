import java.util.*;
public class lexicographic_order {
    public static void main(String[] args){
        Set<String> words = new TreeSet<String>();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++){
            words.add(scanner.next());
        }
        for (String word : words){
            System.out.println(word);
        }
    }
}

/*
postgres
sqlite
oracle
mongodb
postgres
mssql
 */