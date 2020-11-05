import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadPoolExecutor;

public class Semaphor {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(100);
        for (int i = 0; i < 10; i++){
            executorService.submit(new Work2());
        }
        executorService.shutdown();
    }
}

class Work2 implements Runnable{

    private static Semaphore semaphore = new Semaphore(2);

    public Work2(){}

    @Override
    public void run(){
        try {
            semaphore.acquire();
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            semaphore.release();
        }
    }
}
