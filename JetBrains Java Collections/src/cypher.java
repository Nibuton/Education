import java.util.*;
public class cypher {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        String decoding = input.next();
        String encoding = input.next();
        String to_encode = input.next();
        String to_decode = input.next();
        dicts dict = new dicts();
        for (int i = 0; i < decoding.length(); i++){
            dict.addSymbols(decoding.charAt(i), encoding.charAt(i));
        }
        for (int i = 0; i < to_encode.length(); i++){
            System.out.print(dict.encode(to_encode.charAt(i)));
        }
        System.out.println();
        for (int i = 0; i < to_decode.length(); i++){
            System.out.print(dict.decode(to_decode.charAt(i)));
        }
    }

    static class dicts{
        Map<Character, Character> decode_dict = new HashMap<Character, Character>();
        Map<Character, Character> encode_dict = new HashMap<Character, Character>();
        public dicts(){};
        public void addSymbols(char a, char b){
            decode_dict.put(b,a);
            encode_dict.put(a,b);
        }

        public char decode(char a){
            return decode_dict.get(a);
        }

        public char encode(char a){
            return encode_dict.get(a);
        }
    }
}
