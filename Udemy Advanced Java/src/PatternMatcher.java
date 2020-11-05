import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcher {
    public static void main(String[] args) {
        String text = "NJNJ 12313 jndjn 231jn -.>s[pjsdinan +7-915-246-01-80 dobsdjb )8495uh\n" +
                "slnnnsdkfnksdnfknsdkfnskldnfOA#&%^&^%&^@%????dbfsf84954--420366\n";
        Pattern pattern = Pattern.compile("\\+?[78](-?\\d){10}");
        Matcher matcher = pattern.matcher(text);
        while(matcher.find())
            System.out.println(matcher.group().replaceAll("-",""));

    }
}
