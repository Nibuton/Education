public class Thief implements MailService{
    private int minValue;
    private int stolenValue;

    public Thief(int minValue){
        this.minValue = minValue;
        stolenValue = 0;
    }

    @Override
    public Sendable processMail(Sendable mail) {
        if (mail instanceof MailPackage) {
            MailPackage mailPackage = (MailPackage) mail;
            if (mailPackage.getContent().getPrice() >= minValue) {
                stolenValue += mailPackage.getContent().getPrice();
                String content = "stones instead of " + mailPackage.getContent().getContent();
                return new MailPackage(mail.getFrom(), mail.getTo(), new Package(content, 0));
            }
        }
        return mail;
    }

    public int getStolenValue(){
        return stolenValue;
    }
}
