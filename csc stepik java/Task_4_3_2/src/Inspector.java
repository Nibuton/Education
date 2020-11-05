public class Inspector implements MailService{

    public Inspector(){}

    @Override
    public Sendable processMail(Sendable mail) {
        if (mail instanceof MailPackage) {
            String content = ((MailPackage) mail).getContent().getContent();
            if (content.equals("weapons") || content.equals("banned substance")) {
                throw new IllegalPackageException();
            } else if (content.contains("stones")) {
                throw new StolenPackageException();
            }
        }
        return mail;
    }

}
