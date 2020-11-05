package chapter9;

import chapter9.packageForTask11.Task11;

public class MainForTask11 {
    public static void main(String[] args) {
        Apply.process(new Task11Adapter(new Task11()), "Gandon");
    }
}

class Task11Adapter implements Processor{

    private Task11 task11;

    public Task11Adapter(Task11 task11){this.task11 = task11;}

    @Override
    public String name() {
        return this.getClass().getSimpleName();
    }

    @Override
    public String process(Object input) {
        return task11.change((String) input);
    }
}


