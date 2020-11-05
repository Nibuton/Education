public abstract class Sendable <C> {
    private String from;
    private String to;
    private C content;

    public Sendable(String from, String to, C content){
        this.from = from;
        this.to = to;
        this.content = content;
    }

    public String getTo() {
        return to;
    }

    public String getFrom() {
        return from;
    }

    public C getContent(){
        return content;
    }
}
