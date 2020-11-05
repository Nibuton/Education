public class Analyzers {
    public static void main(String[] args) {
        TooLongTextAnalyzer tooLongTextAnalyzer = new TooLongTextAnalyzer(5);
        NegativeTextAnalyzer negativeTextAnalyzer = new NegativeTextAnalyzer();
        SpamAnalyzer spamAnalyzer = new SpamAnalyzer(new String[]{"haha", "Maxim"});
        System.out.println(checkLabels(new TextAnalyzer[]{tooLongTextAnalyzer, negativeTextAnalyzer}, "text etxt"));
        System.out.println(checkLabels(new TextAnalyzer[]{tooLongTextAnalyzer, negativeTextAnalyzer}, "text"));
        System.out.println(checkLabels(new TextAnalyzer[]{tooLongTextAnalyzer, negativeTextAnalyzer}, "te:("));
        System.out.println(checkLabels(new TextAnalyzer[]{spamAnalyzer, negativeTextAnalyzer}, "Maximt("));
    }

    public static Label checkLabels(TextAnalyzer[] analyzers, String text) {
        Label answer = Label.OK;
        for (TextAnalyzer analyzer : analyzers){
            answer = analyzer.processText(text);
            if (answer != Label.OK){
                break;
            }
        }
        return answer;
    }
}
