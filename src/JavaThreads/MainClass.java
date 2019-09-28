package JavaThreads;

public class MainClass {
    public static void main(String[] args) throws InterruptedException {
        // extend  the thread class and override the run methods
        JavaThreadSample threadSample = new JavaThreadSample();
        Thread.sleep(2000);

        threadSample.start();

        // implement the Runnable interface and override the run methods
        Thread thread = new Thread(new JavaThreadSample());
        thread.start();

        Thread.sleep(1000);
        System.out.println("Hello world there");
    }
}
