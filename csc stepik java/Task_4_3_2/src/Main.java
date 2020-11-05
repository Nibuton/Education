import java.util.logging.Logger;

public class Main {
    public static void main(String[] args){

        Logger logger = Logger.getLogger("MyLogger");
        Spy spy = new Spy(logger);
        Thief thief = new Thief(100);
        Inspector inspector = new Inspector();
        MailService[] thirdFaces = {spy, thief, inspector};
        UntrustworthyMailWorker untrustworthyMailWorker = new UntrustworthyMailWorker(thirdFaces);

        MailMessage mail = new MailMessage("Nikita","Austin Powers","weapons");
        MailPackage mailPackage = new MailPackage("Nikita","Katya", new Package("I love you", 190));

        untrustworthyMailWorker.processMail(mail);
        try {
            untrustworthyMailWorker.processMail(mailPackage);
        }
        catch(StolenPackageException spe){
            System.out.println(thief.getStolenValue());
            throw spe;
        }


        /*spy.processMail(mail);
        MailPackage newmail = (MailPackage) thief.processMail(mailPackage);

        thief.processMail(mailPackage);

        System.out.println(thief.getStolenValue());
        System.out.println(newmail.getContent().getContent()); */

        inspector.processMail(mailPackage);

    }
}
