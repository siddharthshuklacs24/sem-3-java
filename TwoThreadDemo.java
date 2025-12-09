class MessageThread extends Thread {
    private String message;
    private int interval;  // in milliseconds

    public MessageThread(String message, int interval) {
        this.message = message;
        this.interval = interval;
    }

    @Override
    public void run() {
        while (true) {
            System.out.println(message);
            try {
                Thread.sleep(interval);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted: " + e.getMessage());
            }
        }
    }
}

public class TwoThreadDemo {
    public static void main(String[] args) {
        // Thread 1: prints every 10 seconds
        MessageThread t1 = new MessageThread("BMS College of Engineering", 10000);

        // Thread 2: prints every 2 seconds
        MessageThread t2 = new MessageThread("CSE", 2000);

        t1.start();
        t2.start();
    }
}
