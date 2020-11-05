import java.util.*;
import java.util.function.Consumer;

public class MailService <T> implements Consumer<Sendable<T>>{

    private Map<String, List<T>> mailBox;

    public MailService(){
        this.mailBox = new HashMap<String, List<T>>(){

            @Override
            public List<T> get(Object key) {
                if (this.containsKey(key)){
                    return super.get(key);
                }
                return new ArrayList<T>();
            }
        };
    }

    public Map<String, List<T>> getMailBox() {
        return mailBox;
    }

    @Override
    public void accept(Sendable<T> t) {
        if (!mailBox.containsKey(t.getTo())){ ;
            mailBox.put(t.getTo(), new ArrayList<T>());
        }
        mailBox.get(t.getTo()).add(t.getContent());
    }
}
