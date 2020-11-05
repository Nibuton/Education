class NegativeTextAnalyzer extends KeywordAnalyzer{

    private static final Label label = Label.NEGATIVE_TEXT;
    private static final String[] keyWords = {":(", "=(", ":|"};

    @Override
    protected Label getLabel() {
        return label;
    }

    @Override
    protected String[] getKeywords() {
        return keyWords;
    }
}
