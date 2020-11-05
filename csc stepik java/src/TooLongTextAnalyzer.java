class TooLongTextAnalyzer implements TextAnalyzer{

    private int maxLength;
    private static final Label label = Label.TOO_LONG;

    public TooLongTextAnalyzer(int maxLength){
        this.maxLength = maxLength;
    }

    @Override
    public Label processText(String text) {
        Label answer = Label.OK;
        if (text.length() > maxLength){
            answer = label;
        }
        return answer;
    }
}
