import java.util.concurrent.*;

public class Multi {
    public static void main(String[] args) throws InterruptedException {
       /*Work work =  new Work(1);
       work.doWork();
       System.out.println(work.getCounter1());
       System.out.println(work.getCounter2());*/

        ExecutorService executorService = Executors.newFixedThreadPool(5);

        long begin = System.currentTimeMillis();

        for (int i = 0; i < 5; i++){
            executorService.submit(new Work(i));
        }

        executorService.shutdown();

        executorService.awaitTermination(1, TimeUnit.HOURS);

        long end = System.currentTimeMillis();

        System.out.println((end - begin) + " ms it has taken to complete all works!");

    }
}

class Work implements Runnable{

    private int counter1;
    private int counter2;
    private int id;

    Object lock1 = new Object();
    Object lock2 = new Object();

    public Work(int id){
        this.id = id;
    }


    public void increment1(){
        synchronized (lock1) {
            counter1++;
        }
    }

    public void increment2(){
        synchronized (lock2) {
            counter2++;
        }
    }

    public void doWork() throws InterruptedException {

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100000; i++) {
                    increment1();
                    increment2();
                }
            }
        });

        Thread thread2  = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100000; i++) {
                    increment1();
                    increment2();
                }
            }
        });
        long begin = System.currentTimeMillis();

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        long end = System.currentTimeMillis();
        System.out.println((end - begin) + " ms");
    }

    public int getCounter1() {
        return counter1;
    }

    public int getCounter2() {
        return counter2;
    }

    /**
     * When an object implementing interface <code>Runnable</code> is used
     * to create a thread, starting the thread causes the object's
     * <code>run</code> method to be called in that separately executing
     * thread.
     * <p>
     * The general contract of the method <code>run</code> is that it may
     * take any action whatsoever.
     *
     * @see Thread#run()
     */
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++){
            try {
                Thread.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Work " + id + " is done!");
    }
}


