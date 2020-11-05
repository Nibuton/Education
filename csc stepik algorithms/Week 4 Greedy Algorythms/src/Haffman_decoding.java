import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Haffman_decoding {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int k = userInput.nextInt();
        int l = userInput.nextInt();
        Map<String, Character> letters = new HashMap<>();
        String s;
        Character c;
        String subs;
        String decode;
        for (int i = 0; i < k; i++){
            s = userInput.useDelimiter("\n").next();
            c = s.charAt(0);
            subs = s.substring(3);
            letters.put(subs, c);
        }
        decode = userInput.next();
        subs = "";
        for (int i = 0; i < decode.length(); i++){
            c = decode.charAt(i);
            subs += c;
            if(letters.containsKey(subs)){
                System.out.print(letters.get(subs));
                subs = "";
            }
        }
    }
}

