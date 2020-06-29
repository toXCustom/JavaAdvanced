package pl.javaadvanced.threads.counter;

public class Main {
    public static void main(String[] args) {
        Countdown countdown = new Countdown();

        CountdownThread thread1 = new CountdownThread(countdown);
        CountdownThread thread2 = new CountdownThread(countdown);

        thread1.setName("Thread1");
        thread2.setName("Thread2");

        thread1.start();
        thread2.start();
    }
}
