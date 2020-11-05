import java.util.*;

public class JB_list {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String braces = scanner.next();
        ArrayDeque<Character> stack = new ArrayDeque<Character>();
        boolean answer = true;
        if (braces.length() % 2 == 1){
            answer = false;
        }
        else {
            loop:
            for (int i = 0; i < braces.length(); i++) {
                if (stack.size() > 0) {
                    switch (braces.charAt(i)) {
                        case ')':
                            if (stack.pop() == '(') {
                                break;
                            } else {
                                answer = false;
                                break loop;
                            }
                        case ']':
                            if (stack.pop() == '[') {
                                break;
                            } else {
                                answer = false;
                                break loop;
                            }
                        case '}':
                            if (stack.poll() == '{') {
                                break;
                            } else {
                                answer = false;
                                break loop;
                            }
                        default:
                            stack.push(braces.charAt(i));
                    }
                }
                else{
                    stack.push(braces.charAt(i));
                }
            }
        }
        System.out.println(answer);
    }
}

