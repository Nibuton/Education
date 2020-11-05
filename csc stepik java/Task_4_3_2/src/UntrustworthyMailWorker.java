public class UntrustworthyMailWorker implements MailService{

    MailService[] thirdFaces;
    RealMailService realMailService;

    public UntrustworthyMailWorker(MailService[] thirdFaces){
        this.thirdFaces = thirdFaces;
        realMailService = new RealMailService();
    }


    public RealMailService getRealMailService(){
        return realMailService;
    }

    @Override
    public Sendable processMail(Sendable mail) {
        for (MailService person : thirdFaces){
            mail = person.processMail(mail);
        }
        return realMailService.processMail(mail);
    }
}
