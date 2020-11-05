import java.util.*;
public class Spell_Checker {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int d = input.nextInt();
        Set<String> dict = new HashSet<String>();
        Set<String> words = new HashSet<String>();
        for (int i = 0; i < d; i++){
            dict.add(input.next().toLowerCase());
        }
        int l = input.nextInt();
        String line;
        for (int i = 0; i < l+1; i++){
            line = input.nextLine();
            String[] line_words = parse(line);
            for (String s: line_words){
                words.add(s);
            }
        }
        words.removeAll(dict);
        for (String word : words){
            System.out.println(word);
        }
    }

    public static String[] parse(String s){
        String[] words = s.toLowerCase().split(" ");
        return words;
    }
}
