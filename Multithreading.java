// Define a message class for passing messages between threads
class Message {
    private String content;

    public synchronized String getContent() {
        return content;
    }

    public synchronized void setContent(String content) {
        this.content = content;
    }
}

public class A4 {
    public static void main(String[] args) {
        // Create a shared message object
        final Message message = new Message();

        // Create the first thread
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                // Loop to receive messages and send replies
                for (int i = 0; i < 10; i++) {
                    String received = message.getContent();
                    System.out.println("Thread 1 received message: " + received);
                    String reply = "Message " + i + " received";
                    message.setContent(reply);
                    System.out.println("Thread 1 sent reply: " + reply);
                }
            }
        });

        // Create the second thread
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                // Loop to send messages and receive replies
                for (int i = 0; i < 10; i++) {
                    String messageText = "Message " + i;
                    message.setContent(messageText);
                    System.out.println("Thread 2 sent message: " + messageText);
                    String received = message.getContent();
                    System.out.println("Thread 2 received reply: " + received);
                }
            }
        });

        // Start both threads
        t1.start();
        t2.start();

        // Wait for both threads to finish before exiting
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
