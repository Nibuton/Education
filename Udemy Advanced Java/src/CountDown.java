import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CountDown {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(5);
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 5; i++){
            executorService.submit(new Processor(countDownLatch));
        }
        executorService.shutdown();

        countDownLatch.await();

        System.out.println("Main has been released");

    }
}

class Processor implements Runnable{

    private CountDownLatch countDownLatch;
    static private int id = 0;

    public Processor(CountDownLatch countDownLatch){
        System.out.println("I have been made");
        this.countDownLatch = countDownLatch;
        id++;
        System.out.println("My id is " + id);
    }

    @Override
    public void run(){
        try{
            Thread.sleep(id * 1000);
        } catch(InterruptedException e){
            e.printStackTrace();
        } finally{
            countDownLatch.countDown();
            System.out.println("I have decremented countDownLatch to " + countDownLatch.getCount());
        }
    }

}
