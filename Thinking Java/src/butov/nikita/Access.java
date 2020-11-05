package butov.nikita;

public class Access {
    private int priv = 0;
    int pack = 1;
    protected int pro = 2;
    public int pub = 3;

    public Access(String name){
        System.out.println("Hello!" + name);
    }

    public void say(String name){
        System.out.println("Access " + name);
    }
}

class InAccess extends Access{

    public InAccess(){
        super(" Nikita");
        System.out.println("Hello, from second level");
    }

    @Override
    public void say(String name) {
        super.say(name);
    }
}

class InInAccess extends InAccess{
    public InInAccess(){
        System.out.println("Hi, from below");
    }
}
