
public class runable_Interface implements Runnable {

    private String name;

    public runable_Interface(String name) {
        this.name = name;
    }

    public void run() {
        System.out.println("Starting thread " + name);
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread " + name + " is running " + i);
            try {
                Thread.sleep(1000); // Pause the thread for one second
            } catch (InterruptedException e) {
                System.out.println("Thread " + name + " interrupted.");
            }
        }
        System.out.println("Thread " + name + " exiting.");
    }

    public static void main(String[] args) {
        System.out.println("Main thread starting.");

        // Create and start two new threads
        runable_Interface r1 = new runable_Interface("Thread 1");
        Thread t1 = new Thread(r1);
        t1.start();

        runable_Interface r2 = new runable_Interface("Thread 2");
        Thread t2 = new Thread(r2);
        t2.start();

        // Wait for both threads to finish
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }

        System.out.println("Main thread exiting.");
    }
}
