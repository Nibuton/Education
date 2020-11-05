import java.util.*;

public class War_And_Piece {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> words = new HashMap<String, Integer>();
        String s = scanner.nextLine();
        String[] words_split = s.split(" ");
        for (String word : words_split){
            word = word.toLowerCase();
            if (words.containsKey(word)){
                words.put(word, words.get(word) + 1);
            }
            else{
                words.put(word,1);
            }
        }
        for (Map.Entry<String, Integer> el : words.entrySet()){
            System.out.println(el.getKey() + " " + el.getValue());
        }
    }
}
