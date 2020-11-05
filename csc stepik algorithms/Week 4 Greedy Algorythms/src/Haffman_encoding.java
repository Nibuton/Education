import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;


class Haffman_encoding {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        String test = userInput.next();
        Map<Character, Integer> num = Freq(test);
        PriorityQueue<Node> queue = new PriorityQueue<Node>();
        Map<Character, Leaf> dict  = new HashMap<Character, Leaf>();
        for (Map.Entry<Character, Integer> entry: num.entrySet()){
            Leaf l = new Leaf(entry.getKey(), entry.getValue());
            queue.add(l);
            dict.put(entry.getKey(), l);
        }
        /* for (Node l : queue){
            System.out.println(l.frequency);
        } */
        int sum = 0;
        if (queue.size() == 1) {
            System.out.println("1 " + num.get(test.charAt(0)));
            System.out.println(test.charAt(0) + ": 0");
            for(int i = 0; i < test.length(); i++){
                System.out.print("0");
            }
        }
        else {
            while (queue.size() > 1) {
                Node left = queue.poll();
                Node right = queue.poll();
                sum = sum + left.frequency + right.frequency;
                Inside_Node node = new Inside_Node(left, right);
                queue.add(node);
            }
            System.out.println(num.size() + " " + sum);
            queue.poll().setCode("");
            for (int i = 0; i < test.length(); i++) {
                System.out.print(dict.get(test.charAt(i)).code);
            }
        }
    }

    public static Map<Character, Integer> Freq (String s){
        Map<Character, Integer> letters = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if (letters.containsKey(c)){
                letters.put(c, letters.get(c) + 1);
            }
            else{
                letters.put(c,1);
            }
        }
        return letters;
    }
}

abstract class Node implements Comparable<Node>{
    int frequency;
    String code;

    public void setCode(String code){
        this.code = code;
    }

    @Override
    public int compareTo(Node o) {
        return (Integer.compare(frequency, o.frequency));
    }
}

class Leaf extends Node{
    char letter;
    public Leaf(char letter, int frequency){
        this.frequency = frequency;
        this.letter = letter;
    }

    public void setCode(String code){
        this.code = code;
        System.out.println(letter + ": " + this.code);
    }
}

class Inside_Node extends Node{
    Node left;
    Node right;

    public Inside_Node(Node left, Node right){
        this.frequency = left.frequency + right.frequency;
        this.left = left;
        this.right = right;
    }

    public void setCode(String code){
        this.code = code;
        left.setCode(this.code + "1");
        right.setCode(this.code + "0");
    }

}
