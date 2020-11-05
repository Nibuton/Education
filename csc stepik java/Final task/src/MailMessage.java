public class MailMessage extends Sendable<String>{

    private String content;

    public MailMessage(String from, String to, String content){
        super(from, to, content);
    }
}
