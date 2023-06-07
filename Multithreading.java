
public class  Multithreading 
    {
    public static void main(String[] args) {
        // Create two threads
        Thread thread1 = new Thread(new MyRunnable(), "Thread 1");
        Thread thread2 = new Thread(new MyRunnable(), "Thread 2");
        
        // Start the threads
        thread1.start();
        thread2.start();
    }
}

class MyRunnable implements Runnable {
    @Override
    public void run() {
        try {
            // Sleep for a random amount of time (between 1 and 5 seconds)
            int sleepTime = (int) (Math.random() * 4000) + 1000;
            System.out.println(Thread.currentThread().getName() + " sleeping for " + sleepTime + " milliseconds.");
            Thread.sleep(sleepTime);
            
            // Do some work
            int sum = 0;
            for (int i = 1; i <= 10; i++) {
                sum += i;
            }
            System.out.println(Thread.currentThread().getName() + " calculated sum = " + sum);
        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName() + " was interrupted.");
        }
    }
}
