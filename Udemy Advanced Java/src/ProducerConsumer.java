import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProducerConsumer {

    private static BlockingQueue<Integer> blockingQueue = new ArrayBlockingQueue(10);
    private static Random random = new Random();

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    produce();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try{
                    consume();
                } catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();
    }

    public static void produce() throws InterruptedException {
        while(true){
            Thread.sleep(100);
            blockingQueue.put(random.nextInt(100));
        }
    }

    public static void consume() throws InterruptedException {
        Thread.sleep(10000);
        while(true){
            Thread.sleep(100);
            System.out.println("I took " + blockingQueue.take());
            System.out.println("Queue capacity is " + blockingQueue.size());
        }
    }
}
