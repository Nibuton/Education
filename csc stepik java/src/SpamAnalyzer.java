class SpamAnalyzer extends KeywordAnalyzer{

    private String[] keyWords;
    private static final Label label = Label.SPAM;

    public SpamAnalyzer(String[] keywords){
        this.keyWords = keywords;
    }

    @Override
    protected Label getLabel() {
        return label;
    }

    @Override
    protected String[] getKeywords() {
        return this.keyWords;
    }
}
