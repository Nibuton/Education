abstract class KeywordAnalyzer implements TextAnalyzer{

    abstract protected Label getLabel();

    abstract protected String[] getKeywords();

    public Label processText(String text){
        Label answer = Label.OK;
        for (String word : this.getKeywords()){
            if (text.contains(word)){
                answer = this.getLabel();
            }
        }
        return answer;
    }
}
