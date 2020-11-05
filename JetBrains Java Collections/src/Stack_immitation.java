import java.lang.reflect.Array;
import java.util.*;
public class Stack_immitation {
    public static void main(String[] args) {
        String input;
        int in;
        ArrayDeque<Pair> stack = new ArrayDeque<Pair>();
        Scanner scanner = new Scanner(System.in);
        int max;
        int n = scanner.nextInt();
        List<Integer> answer = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            input = scanner.next();
            switch (input) {
                case "push":
                    in = scanner.nextInt();
                    if (stack.size() == 0){
                        Pair pair = new Pair(in, in);
                        stack.push(pair);
                    }
                    else{
                        if (in > stack.getFirst().getLocalMax()){
                            Pair pair = new Pair(in, in);
                            stack.push(pair);
                        }
                        else{
                            Pair pair = new Pair(in, stack.getFirst().getLocalMax());
                            stack.push(pair);
                        }
                    }
                    break;
                case "pop":
                    stack.pollFirst();
                    break;
                case "max":
                    answer.add(stack.getFirst().getLocalMax());
                    break;
            }
        }
        for (int a : answer){
            System.out.println(a);
        }
    }

    public static class Pair{
        int number;
        int localMax;

        public Pair(int number, int localMax){
            this.number = number;
            this.localMax = localMax;
        }

        public int getNumber(){
            return this.number;
        }

        public int getLocalMax(){
            return this.localMax;
        }
    }
}
