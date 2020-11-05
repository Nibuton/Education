import java.util.concurrent.locks.ReentrantLock;

public class Reentrant {
    public static void main(String[] args) throws InterruptedException{
        Task task = new Task();
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 100000; i++)
                task.increment();
        });
        Thread thread2 = new Thread(() ->{
            for (int i = 0; i < 100000; i++)
                task.increment();
        });
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();

        System.out.println(task.getCounter());
    }

}

class Task{

    private int counter;
    private ReentrantLock reentrantLock = new ReentrantLock();

    public void increment(){
        reentrantLock.lock();
        counter++;
        reentrantLock.unlock();
    }

    public int getCounter() {
        return counter;
    }
}
