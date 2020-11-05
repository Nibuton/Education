import java.util.HashMap;
import java.util.Map;

/** Программа для подготовки текста с репликами по персонажам.
 * @author Nikita Butov
 * @author Katya Ivanova
 * @version 1.3
 */
public class Play {
    /** Точка входа в программу
     * @param args Массив строковых аргументов
     */
    public static void main(String[] args) {
        String [] roles = {
                "Городничий","Аммос Федорович",
                "Артемий Филиппович",
                "Лука Лукич"};
        String [] textLines = {"Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.",
                "Аммос Федорович: Как ревизор?",
                "Артемий Филиппович: Как ревизор?",
                "Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.",
                "Аммос Федорович: Вот те на!",
                "Артемий Филиппович: Вот не было заботы, так подай!",
                "Лука Лукич: Господи боже! еще и с секретным предписаньем!"};
        String s = printTextPerRole(roles, textLines);
        System.out.println(s);
    }

    /**
     * Основной метод программы
     * @param roles String[] список ролей
     * @param textLines String[] список реплик
     * @return String строка, содержащая роли и их реплики в пронумерованном виде
     */
    public static String printTextPerRole(String[] roles, String[] textLines) {
        Map<String, StringBuilder> script = new HashMap<>();
        for (String role : roles){
            script.put(role + ":", new StringBuilder(""));
        }
        /** Счетчик для нумерации строк */
        int counter = 1;
        for (String line: textLines){
            String role = line.substring(0,semicolIndex(line));
            String words = counter + ") " + line.substring(semicolIndex(line)) + "\n";
            script.get(role).append(words);
            counter++;
        }
        return makeAnswer(script, roles);
    }

    /**
     * Метод, возвращаюший индекс нахождения в строке первого двоеточия
     * @param words String
     * @return Int
     */
    public static int semicolIndex(String words){
        char[] ch = words.toCharArray();
        int counter = 0;
        while(ch[counter] != ':'){
            counter++;
        }
        return counter + 1;
    }

    public static String makeAnswer(Map<String, StringBuilder> script, String[] roles){
        StringBuilder answer = new StringBuilder("");
        for (String role : roles){
            role = role + ":";
            answer.append(role + "\n");
            answer.append(script.get(role) + "\n");
        }
        return answer.toString();
    }

    /* private static String printTextPerRole(String[] roles, String[] textLines) {
        StringBuilder line = new StringBuilder();
        for (String role : roles) {
            line.append(role + ":\n");
            for (int i = 0; i < textLines.length; i++) {
                if (textLines[i].startsWith(role + ":")) {
                    line.append((i+1) + ")" + textLines[i].substring(role.length() + 1) + "\n");
                }
            }
            line.append("\n");
        }
        return line.toString();
    } */
}
