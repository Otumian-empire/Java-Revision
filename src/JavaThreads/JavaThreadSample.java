package JavaThreads;

public class JavaThreadSample extends Thread implements Runnable {
    @Override
    public void run() {
        System.out.println("I am a new thread");
    }
}
