import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MaxKucha {
    public static void main(String[] args) {
        Kucha kucha = new Kucha();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] commands = new String[n];
        scanner.nextLine();
        for (int i = 0; i < n; i++){
            commands[i] = scanner.nextLine();
        }
        for (int i = 0; i < n; i++){
            if (commands[i].equals("ExtractMax")){
                kucha.ExtractMax();
            }
            else{
                int num = Integer.valueOf(commands[i].substring(7));
                kucha.insert(num);
            }
        }
    }

    static class Kucha{

        private ArrayList<Integer> queue = new ArrayList<>();

        public Kucha(){}
        public void insert(int num){
            queue.add(num);
            int current_index = queue.size() - 1;
            int parent;
            while(true) {
                parent = (int) Math.floor(Math.max(0,(current_index - 1))/ 2);
                if (queue.get(current_index) > queue.get(parent)) {
                    Collections.swap(queue, current_index, parent);
                    current_index = parent;
                } else {
                    break;
                }
            }
        }
        public void ExtractMax(){
            int l = queue.size();
            if (l > 0) {
                System.out.println(queue.get(0));
                Collections.swap(queue, 0, l - 1);
                queue.remove(l - 1);
            }
            int current_index = 0;
            l--;
            while(true) {
                if (current_index*2 + 2 <= (l - 1)) {
                    int firstChild = queue.get(current_index*2 + 1);
                    int secondChild = queue.get(current_index*2 + 2);
                    if (queue.get(current_index) < Math.max(firstChild, secondChild)) {
                        if (firstChild >= secondChild) {
                            Collections.swap(queue, current_index, current_index*2 + 1);
                            current_index = current_index*2 + 1;
                        } else {
                            Collections.swap(queue, current_index, current_index*2 + 2);
                            current_index = current_index*2 + 2;
                        }
                    }
                    else {
                        break;
                    }
                }
                else if (current_index * 2 + 1 == (l - 1)) {
                    if (queue.get(current_index) < queue.get(current_index*2 + 1)) {
                        Collections.swap(queue, current_index, current_index*2 + 1);
                    }
                    break;
                }
                else {
                    break;
                }
            }
        }
        public void PrintKucha(){
            for (int c : queue){
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }
}

